import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecknowell","root","password" );

		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from customer");
		
		while(rs.next()) {
			
			System.out.println("id="+rs.getInt(1)+" ");
			System.out.println("Name:"+rs.getString(2)+" ");
			System.out.println("Address:"+rs.getString(3)+" ");
		}
		
				
	}

}
