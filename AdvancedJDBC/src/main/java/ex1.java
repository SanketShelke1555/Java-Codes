import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell"; 
		String uname="root";
		String pass="password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		
		Statement st = con.createStatement();
		
		
		String query = "create table stud (rollno int primary key,name varchar(50),marks int)";
		
		st.executeUpdate(query);
		System.out.println("Table Created Successfully...");
		st.close();
		con.close();

	}

}
