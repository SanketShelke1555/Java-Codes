import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//This Code is to add data in doctor db using statement interface.

public class Ass2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		System.out.println("Connection Success");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int r = sc.nextInt();
		
		
		System.out.println("Enter Name:");
		String nm = sc.next();
		
		System.out.println("Enter Age:");
		int ag= sc.nextInt();
		
		Statement stm = con.createStatement();
		String query = "insert into doctor values("+r+",'"+nm+"',"+ag+")";
		
		int rows = stm.executeUpdate(query);
		
		if(rows>0) {
			
			System.out.println("Record inserted");
		}
		else {
			System.out.println("Error");
		}
		
		con.close();

	}

}
