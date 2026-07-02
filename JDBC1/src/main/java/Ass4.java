import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		System.out.println("Connection Success");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to be deleted:");
		int id = sc.nextInt();
		
		
		Statement stm = con.createStatement();
		String query = "delete from doctor where id ="+id;
		
		int rows = stm.executeUpdate(query);
		
		if(rows>0) {
			System.out.println("Record deleted successfully");
		}
		else {
			System.out.println("Error");
		}
		con.close();
	}

}
