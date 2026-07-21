import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String user = "root";
		String pass = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		int r = sc.nextInt();
		
		System.out.println("Enter Name:");
		String nm = sc.next();
		
		System.out.println("Enter Marks:");
		int m=sc.nextInt();
		
		PreparedStatement pstm = con.prepareStatement("insert into studentinfo values(?,?,?)");
		
		pstm.setInt(1, r);
		pstm.setString(2, nm);
		pstm.setInt(3, m);
		
		int i =pstm.executeUpdate();
		
		if(i>0) {
			System.out.println("Data inserted succesfully");
			
			
			PreparedStatement ps = con.prepareStatement("select * from studentinfo where rollno = ?");
			
		    ps.setInt(1, r);

		    ResultSet rs = ps.executeQuery();

		    while(rs.next()) {
		        System.out.println("\nInserted Record:");
		        System.out.println("ID : " + rs.getInt(1));
		        System.out.println("Name : " + rs.getString(2));
		        System.out.println("Marks : " + rs.getInt(3));
		    }
		}
		else {
			System.out.println("Error");
		}
		
		
		
	}

}
