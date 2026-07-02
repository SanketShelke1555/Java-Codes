import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex7 {
	
//This code is to enter multiple records in db.

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		System.out.println("Connection success");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter eid,name,age");
			int eid = sc.nextInt();
			
			String name = sc.next();
			int age = sc.nextInt();
			
			String query = "insert into employee values(?,?,?)";
			PreparedStatement stm = con.prepareStatement(query);
			stm.setInt(1, eid);
			stm.setString(2, name);
			stm.setInt(3, age);
			
			stm.executeUpdate();
			System.out.println("Do you want to continue? (y/n)");
		}
		while(sc.next().equalsIgnoreCase("y"));
		
		System.out.println("Data inserted successfully");
		con.close();
	}

}
