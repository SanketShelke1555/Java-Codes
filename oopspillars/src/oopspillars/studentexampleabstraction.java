package oopspillars;

abstract class Student {
	
	Student(){
		
		int rno;
		String name;
		double marks;
		
		System.out.println("Parent Constractor");
	}
	
	abstract public void display();
	
	public void show() {
		
		System.out.println("Show Method Called");
	}
	
}

 class studentdetails{
	
}

public class studentexampleabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
