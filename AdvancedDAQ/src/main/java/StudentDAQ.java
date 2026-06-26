import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAQ {

	Connection con;
	PreparedStatement pstm;
	Statement st;
	ResultSet rs;
	
	
	public void connect() throws SQLException, ClassNotFoundException {
		
		String url,user,pass;
		
		url = "jdbc:mysql://localhost:3306/tecknowell";
		
		user = "root";
		pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection(url,user,pass);
		System.out.println("Connected DB: " + con.getCatalog());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void insertdata(Student s) throws SQLException {
		
		String sql = "insert into stud values(?,?,?)";
		pstm = con.prepareStatement(sql);
		
		pstm.setInt(1, s.rollno);
		
		pstm.setString(2, s.name);
		
		pstm.setInt(3, s.marks);
		
		pstm.executeUpdate();
		
		System.out.println("Data inserted successfully...");
	}

}
