package oopspillars;


abstract class user{
	
	user(){
		System.out.println("Parent Class Constructor");
	}
	
	abstract public void display();
	
	public void show() {
		
		System.out.println("Show Method");
	}
}

class user1 extends user{
	
	user1(){
		
		System.out.println("Child Class Constructor");
	}
	
	public void display() {
		System.out.println("Display Method");
	}
	
	public void setdata() {
		
		System.out.println("Setdata Method");
	}
}

public class Abstractex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		user1 obj = new user1();
		
		obj.display();
		obj.show();
		obj.setdata();
		

	}

}
