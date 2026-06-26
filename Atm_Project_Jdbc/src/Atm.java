import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Atm {

	static Connection con;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","password");
			
			System.out.println("1. Register User");
			System.out.println("2. Login ATM");
			System.out.print("Enter Choice:");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				registerUser();
				loginUser();
				break;
				
			case 2: 
				loginUser();
				break;
			
			
			default:
				System.out.println("Invalid Choice");
		}
		
		con.close();
		
	
	} catch(Exception e) {
		e.printStackTrace();
	}

}
	
	
	static void registerUser() throws SQLException {
		
		System.out.println("Enter Account No: ");
		int accNo = sc.nextInt();
		
		System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        
        String sql = "insert into account values(?,?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accNo);
        ps.setString(2, name);
        ps.setInt(3, pin);
        ps.setDouble(4, bal);
        
        ps.executeUpdate();
        System.out.println("User Register Successfully");
	}
	
	
	static void loginUser() throws SQLException {
		
		System.out.println("Enter Account no: ");
		int accNo = sc.nextInt();
		
		System.out.println("Enter Pin:");
		int pin = sc.nextInt();
		
		String sql = "select * from account where acc_no=? and pin=?";
		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, accNo);
		ps.setInt(2, pin);
		
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			
		System.out.println("Login Successful");
		atmMenu(accNo);
		}
		else {
			System.out.println("Invalid Acoount or PIN");
		}
				
	}


	 static void atmMenu(int accNo) throws SQLException {
		
		 while(true) {
			 
			 System.out.println("1. Deposite");
			 System.out.println("2. Withdraw");
			 System.out.println("3. Update");
			 System.out.println("4. Delete User");
			 System.out.println("5. Exit");
			 System.out.println("Choose: ");
			 
			 int choice = sc.nextInt();
			 
			 switch(choice) {
			 case 1:
				 deposite(accNo);
				 break;
				 
			 case 2:
				 withdraw(accNo);
				 break;
				 
			 case 3:
				 updateUser(accNo);
				 break;
				 
			 case 4:
				 deleteUser(accNo);
				 break;
				 
			 case 5: 
				 System.out.println("Thank you...!");
				 return;
				 
			default:
				System.out.println("Invalid choice");
			 }
		 }
		
	}
	 
	 static void deposite(int accNo) throws SQLException{
		 
		 System.out.println("Enter Amount: ");
		 double amt = sc.nextDouble();
		 
		 String sql = "update account set balance= balance+ ? where acc_no=?";
		 
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setDouble(1, amt);
		 ps.setInt(2, accNo);
		 
		 ps.executeUpdate();
		 System.out.println("Deposite Successful...");
		 
	 }
	 
	 static void withdraw(int accNo) throws SQLException {
		 
		 System.out.println("Enter Amount: ");
		 double amt = sc.nextDouble();
		 
		 
		 String sql = "update account set balance = balance - ? where acc_no=?";
		 
		 PreparedStatement ps = con.prepareStatement(sql);
		 
		 ps.setDouble(1, amt);
		 ps.setInt(2, accNo);

		 ps.executeUpdate();
		 System.out.println("Withdraw Successful");	 
	 }
	 
	 static void updateUser(int accNo) throws SQLException {
		 
		 System.out.print("Enter Name: ");
		 String name = sc.next();
		 
		 String sql = "update account set name=? where acc_no=?";
		 
		 PreparedStatement ps = con.prepareStatement(sql);
		 
		 ps.setString(1, name);
		 ps.setInt(2, accNo);
		 
		 ps.executeUpdate();
		 System.out.println("Name Updated");
	 }
	 
	 static void deleteUser(int accNo) throws SQLException {
		 
		 String sql = "delete * from account where acc_no=?";
		 
		 PreparedStatement ps = con.prepareStatement(sql);
		 
		 ps.setInt(1, accNo);
		 
		 ps.executeUpdate();
		 System.out.println("User Deleted Successfully...");
		 
	 }
}
