import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	Connection con;
	Statement stm;
	PreparedStatement pstm;
	ResultSet rs;
	
//connect method
	public void connect() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tecknowell","root","password");
	}
	
//insert student method
	public void insertStudent(Student s) throws SQLException {
		
		pstm=con.prepareStatement("insert into studentinfo values(?,?,?)");
		pstm.setInt(1, s.rollno);
		pstm.setString(2, s.name);
		pstm.setInt(3, s.marks);
		
		int i=pstm.executeUpdate();
		
		if(i>0) {
			
			System.out.println("Record inserted successfully....");
		}
		else {
			System.out.println("Error");
		}
	}
	
//delete student data method
	public void deleteStudent(Student s) throws SQLException {
		
		pstm=con.prepareStatement("delete from studentinfo where rollno=?");
		pstm.setInt(1, s.rollno);
		
		int i=pstm.executeUpdate();
		
		if(i>0) {
			System.out.println("Record deleted successfully");
		}
		else {
			
			System.out.println("Error");
		}
	}
	
//display student data.
	public void displaystudent(Student s) throws SQLException {
		
		stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from studentinfo");
		
		while(rs.next()) {
			
			System.out.println("Rollno:"+rs.getInt(1));
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Marks:"+rs.getInt(3));
			System.out.println();
		}
	
	}
	
//update student data.
	public void updateStudent(Student s) throws SQLException {
		
		stm=con.createStatement();
		
		int i = stm.executeUpdate("update studentinfo set name='Mansi',marks=100 where rollno="+s.rollno);
		
		if(i>0) {
			
			System.out.println("Record updated successfully...");
		}
		else {
			System.out.println("Error");
		}
		
	}
}
