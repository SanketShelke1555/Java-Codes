import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preperadeex3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String uname = "root";
		String pass = "password";
		
		int rno=15;
		
		String name = "Vatsalata";
		int mk = 100;
		
		String query = "insert into stud values(?,?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, rno);
		st.setString(2, name);
		st.setInt(3, mk);
		
		
		int count = st.executeUpdate();
		
		
		
		System.out.println(count + "Rows Affected");
		
		st.close();
		con.close();
		
		

	}

}
