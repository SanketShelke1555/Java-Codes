import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex2 {


		// TODO Auto-generated method stub

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			String url = "jdbc:mysql://localhost:3306/tecknowell";
			String user = "root";
			String password = "password";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection success");
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from student");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				System.out.println();
			}
			con.close();
			
	}
	}
	


