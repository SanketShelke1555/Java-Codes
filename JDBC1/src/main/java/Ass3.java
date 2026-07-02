import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//This code is to update doctor db using statement interface.

public class Ass3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass = "password";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		System.out.println("Connection Success");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		int id = sc.nextInt();
		
		System.out.println("Enter new Age:");
		int ag = sc.nextInt();
		
		
		Statement stm = con.createStatement();
		String query = "update doctor set age=" + ag + " where id=" + id;
		
		int rows = stm.executeUpdate(query);
		
		if(rows>0) {
			System.out.println("Record updated");
		}
		else {
			System.out.println("Error");
		}
		
		con.close();
	}

}
