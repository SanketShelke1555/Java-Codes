import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//This code is to create new table using PreparedStatement.
public class Ass5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		System.out.println("Connection Success");
		
		String query = "create table employee ("+"eid int,"+"name varchar(25),"+"age int)";
		
		PreparedStatement pstm = con.prepareStatement(query);
		
		pstm.execute();
		
		System.out.println("Table created Successfully");
		
		pstm.close();
		con.close();		

	}

}
