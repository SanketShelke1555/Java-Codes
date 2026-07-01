import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//this code is to get data from our database using id.

public class ex6 {

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
		System.out.println("Enter Id :");
		int r = sc.nextInt();
		
		PreparedStatement pstm = con.prepareStatement("select * from student where id=?");
		
		pstm.setInt(1, r);
		
		ResultSet rs= pstm.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
		con.close();
	}

}
