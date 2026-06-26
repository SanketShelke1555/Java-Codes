package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("d://javabatch2.txt");
		
		FileOutputStream fout = new FileOutputStream(f1, true);
		
		
		String name = " Java ";
		
		char ch[] = name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			fout.write(ch[i]);
		}
		
		fout.close();
		System.out.println("Data append successfully");
		
	}
}
