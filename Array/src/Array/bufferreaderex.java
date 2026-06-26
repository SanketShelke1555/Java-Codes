package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreaderex {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter rno,name,marks and grade");

int rno=Integer.parseInt(br.readLine());
String name = br.readLine();
float marks = Float.parseFloat(br.readLine());
char grade=(char)br.read();
System.out.println("Student rno:" +rno+"\tName of Student:"+name+"\tMarks:"+marks+"\tGrade:"+grade);
}

}
