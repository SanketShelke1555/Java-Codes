import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		
		
		int id = sc.nextInt();
		
		System.out.println("Enter new Age:");
		int ad = sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecknowell","root","password");
		
		PreparedStatement pstm = con.prepareStatement("update user set age=? where id= ?");
		
		pstm.setInt(1, ad);
		pstm.setInt(2, id);
		
		int i = pstm.executeUpdate();
		if(i!=0)
		{
			System.out.println("Record updated");
		}
		
		con.close();
	}

}
