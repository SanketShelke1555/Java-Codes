package Array;

class client{
	
	static int uid,salary;
	String name,city;
	
	
	public static void display() {
		
		uid=10;
		salary=700000;
	}
	
	public void setdata() {
		
		name="Sanket";
		city="Pune";
	}
	
	public void show() {
		
		System.out.println("User ID: "+uid);
		System.out.println("User Salary: "+salary);
		System.out.println("User Name: "+name);
		System.out.println("User City: "+city);
	}
}

public class Staticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		client obj=new client();
		obj.setdata();
		client.display();
		obj.show();

	}

}
