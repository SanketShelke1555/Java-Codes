import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class prex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id:");
		
		int id = sc.nextInt();
		
		System.out.println("Enter Name:");
		String nm=sc.next();
		
		System.out.println("Enter Address:");
		int age=sc.nextInt();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecknowell","root","password");
		
		PreparedStatement pstm=con.prepareStatement("insert into user(id,name,age) values(?,?,?)");
		pstm.setInt(1, id);
		pstm.setString(2, nm);
		pstm.setInt(3, age);
		
		int i = pstm.executeUpdate();
		
		if(i!=0)
		{
			
			System.out.println("Record inserted");
		}
		
		else {
			
			System.out.println("Error");
		}
		
		con.close();
		
		
	}

}
