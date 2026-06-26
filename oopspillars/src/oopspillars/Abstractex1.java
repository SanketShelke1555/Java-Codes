package oopspillars;

abstract class userr{
	
	userr(){
		
		System.out.println("Parent Class Constractor");
	}
	
	abstract public void display();
	
	
	public void show() {
		
		System.out.println("Show Method");
	}
}

class userr2 extends userr{
	
	userr2(){
		
		System.out.println("Child Class Constractor");
	}
	
	public void display() {
		
		System.out.println("Display Method");
		
	}
	
	public void setdata() {
		
		System.out.println("SetData Method");
	}
}

public class Abstractex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userr obj=new userr2();
		obj.display();
		obj.show();
		

	}

}
