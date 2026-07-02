import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass= "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		System.out.println("Connection success");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int eid = sc.nextInt();
		
		System.out.println("Enter Employee Name:");
		String nm = sc.next();
		
		System.out.println("Enter Employee Age:");
		int ag = sc.nextInt();
		
		PreparedStatement pstm = con.prepareStatement("insert into employee values(?,?,?)");
		
		pstm.setInt(1, eid);
		pstm.setString(2, nm);
		pstm.setInt(3, ag);
		
		int i = pstm.executeUpdate();
		
		if(i>0) {
			System.out.println("Record inserted");
		}
		else {
			System.out.println("Error");
		}
		con.close();
	}

}
