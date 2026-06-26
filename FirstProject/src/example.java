import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Roll NO. :");
		int rollno = sc.nextInt();
		
		System.out.println("Enter Percentage: ");
		float per = sc.nextFloat();
		
		System.out.println("INFO: "+"Name : "+name+" "+"roll no. is "+ rollno+" Percentage : "+per);

	}

}
