package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class inoutex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("D://javabatch.txt");
		
		FileInputStream fin = new FileInputStream(f1);
		
		FileOutputStream fout = new FileOutputStream("D://javabatch3.txt");
		
		int i;
		
		while((i=fin.read())!=-1) {
			
			fout.write((char)i);
		}
		
		fin.close();fout.close();
		
		System.out.println("Data copied successfully...");
	}

}
