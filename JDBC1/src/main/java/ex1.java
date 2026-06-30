

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String user = "root";
		String password = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection success");
		
		
		Statement stm = con.createStatement();
		int i = stm.executeUpdate("update student set name='Sanket' where id=2");
		
		if(i!=0) {
			
			System.out.println("Data inserted successfully");
		}
		else {
			
			System.out.println("Error");
		}
		con.close();
		

	}

}
