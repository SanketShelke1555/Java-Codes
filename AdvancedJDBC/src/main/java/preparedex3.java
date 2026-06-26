import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class preparedex3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tecknowell";
		String uname = "root";
		String pass = "password";
		
		int rno;
		
		String nm,query;
		
		char ch='y';
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		
		
		Scanner s = new Scanner(System.in);
		while(ch=='y'|| ch == 'y') {
			
			System.out.println("Enter Rollno:");
			rno=s.nextInt();
			System.out.println("Enter Name:");
			nm=s.next();
			System.out.println("Enter Marks:");
			int mk=s.nextInt();
			
			System.out.println("Do you wanna enter more record");
			ch=s.next().charAt(0);
			
			
			query = "insert into stud values("+rno+",'"+nm+"',"+mk+")";
			
			Statement st= con.createStatement();
			
			st.addBatch(query);
			st.executeUpdate(query);
			con.close();
			st.close();
		}

	}

}
