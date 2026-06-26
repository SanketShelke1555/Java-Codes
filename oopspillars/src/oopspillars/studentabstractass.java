package oopspillars;

abstract class student{
	
	int id;
	String name;
	double marks;
	
	student(){
		
		System.out.println("Student(Parent) class Constructor");
	}
	
	abstract public void display();
	
	public void show() {
		
		System.out.println("System Method Called");
	}
}

 class SDetails extends student{
	 
	 SDetails(int sid,String sname,double smarks){
		 
		 System.out.println("Student-Details class Constructor");
		 
		 id=sid;
		 name=sname;
		 marks=smarks;
	 }
	 
	 public void display() {
		 
		 System.out.println("Student Details");
		 System.out.println("Student id: "+id);
		 System.out.println("Student Name: "+name);
		 System.out.println("Student Marks: "+marks);
		 
		 double percentage= (marks/100)*100;
		 System.out.println("Student Percentage: "+percentage);
	 }
	
	 
}

public class studentabstractass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SDetails obj = new SDetails(100,"Sanket",85);
		obj.display();
		
		
		

	}

}
