import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//this code is to insert data in our database.

public class ex3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String user = "root";
		String password = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection success");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		int r = sc.nextInt();
		
		System.out.println("Enter Name:");
		String nm = sc.next();
		
		System.out.println("Enter Marks:");
		int m=sc.nextInt();
		
		PreparedStatement pstm = con.prepareStatement("insert into student values(?,?,?)");
		
		pstm.setInt(1, r);
		pstm.setString(2, nm);
		pstm.setInt(3, m);
		
		int i=pstm.executeUpdate();
		if(i>0) {
			
			System.out.println("Record inserted");
		}
		else {
			System.out.println("Error");
		}
	}

}
