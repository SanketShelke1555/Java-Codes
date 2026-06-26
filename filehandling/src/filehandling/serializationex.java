package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serialization is process of converting object into byte format
//deserialization is process of converting byte format to objcet

class Emp implements Serializable{
	
	public String name,address;
}

public class serializationex {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp();
		e.name = "Sanket";
		e.address = "Pune";
		
		try {
			
			FileOutputStream fos = new FileOutputStream("D://serializationex.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.println("Data Saved inside file");
			
		}
		
		catch(IOException e1) {
			
			e1.printStackTrace();
		}
	}
	
	

}
