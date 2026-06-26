package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bufferex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("d://javabatch.txt");
		
		FileReader fr = new FileReader(f1);
		
		try (BufferedReader br = new BufferedReader(fr)) {
			System.out.println(br.readLine());
		}
		
		
	}

}
