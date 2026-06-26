import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Callablest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/teknowell";
		String uname = "root";
		String pass = "password";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		
		CallableStatement st = con.prepareCall("{call get_recorddetails(12)}");
		
	

	}

}
