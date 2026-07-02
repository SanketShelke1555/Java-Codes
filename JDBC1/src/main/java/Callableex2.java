import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//This code is to get single record from our db.

//create procedure getrecord(id int)
//-> begin
//-> select * from employee where eid=id;
//-> end;
//-> /

public class Callableex2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		
		CallableStatement cs = con.prepareCall("{call getrecord(101)}");
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3) );
		}
		
		con.close();

	}

}
