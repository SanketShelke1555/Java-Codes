package Array;

class user{
	
	int uid,salary;
	String uname,ucity;
	
	public void display(int u,int us, String um,String uc) {
		
		uid=u;
		salary=us;
		uname=um;
		ucity=uc;
	}
	
	public void show(){
		
		System.out.println("User ID: "+uid);
		System.out.println("User Salary: "+salary);
		System.out.println("User Name: "+uname);
		System.out.println("User City: "+ucity);
	}
}

public class ClassObjectex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		user obj=new user();
		obj.display(1, 60000, "Sanket", "Pune");
		obj.show();
	}

}
