import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ass7 {

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
		int id = sc.nextInt();
		
		System.out.println("Enter updated name:");
		String nm= sc.next();
		
		PreparedStatement pstm = con.prepareStatement("update employee set name=? where eid=?");
		
		pstm.setString(1, nm);
		pstm.setInt(2, id);
		
		int i = pstm.executeUpdate();
		
		if(i>0) {
			System.out.println("Record Updated");
		}
		else {
			System.out.println("Error");
		}
		con.close();
	}

}
