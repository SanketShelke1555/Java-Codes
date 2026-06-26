package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserializationex {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Emp e1=null;
		
		try {
			
			FileInputStream fis = new FileInputStream("D://serializationex.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			e1 = (Emp)ois.readObject();
			ois.close();
			fis.close();
		}
		
		finally {
			
			
			System.out.println("Deserialization employee....");
			System.out.println("Name of emplyee:"+e1.name);
			
			System.out.println("Adddress of emplyee:"+e1.address);
		}
	}

}
