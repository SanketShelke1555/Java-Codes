import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//this code is to delete data in our database.

public class ex5 {

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
		
		
		PreparedStatement pstm = con.prepareStatement("delete from student where id=?");
		
		pstm.setInt(1, r);
		
		int i=pstm.executeUpdate();
		if(i>0) {
			
			System.out.println("Record deleted");
		}
		else {
			System.out.println("Error");
			
			con.close();
		}
	}

}
