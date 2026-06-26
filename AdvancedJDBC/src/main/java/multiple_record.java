import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class multiple_record {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String uname = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		String query1="insert into stud values(12,'Mansi',89)";
		String query2="insert into stud values(2,'Yash',15)";
		String query3="insert into stud values(29,'Mohit',35)";
		String query4="insert into stud values(42,'Dodo',75)";
		String query5="insert into stud values(82,'Chaitanya',56)";
		
		
		Statement st = con.createStatement();
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		st.addBatch(query5);
		
		st.executeBatch();
		
		con.close();
		st.close();
		System.out.println("Record inserted Successfully....");

	}

}
