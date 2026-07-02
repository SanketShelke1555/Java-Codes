import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//This code is to enter data using Batch.
//Using this we can add multiple query line in using executebatch.

public class Batchex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String username = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,username,pass);
		
		String query1 = "insert into employee values(115,'Mukta',20)";
		String query2 = "insert into employee values(116,'Mangesh',30)";
		String query3 = "insert into employee values(117,'Ganraj',50)";
		String query4 = "insert into employee values(118,'Kartik',20)";
		
		Statement st = con.createStatement();
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		
		st.executeBatch();
		
		con.close();
		st.close();
		
		System.out.println("Data inserted successfully using batch.");
		
		
	}

}
