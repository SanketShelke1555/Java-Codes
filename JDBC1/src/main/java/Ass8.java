import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//This code is to delete record from emp db using preparedstatement.

public class Ass8 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url ="jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		System.out.println("Connection success");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to be deleted:");
		int id = sc.nextInt();
		
		PreparedStatement pstm = con.prepareStatement("delete from employee where eid=?");
		
		pstm.setInt(1, id);
		
		int i = pstm.executeUpdate();
		
		if(i>0) {
			System.out.println("Record Deleted");
		}
		else {
			System.out.println("Error");
		}
		con.close();

	}

}
