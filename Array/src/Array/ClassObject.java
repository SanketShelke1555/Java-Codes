package Array;

class student{
	
	int rno,marks;
	String name;
	
	public void setdata() {
		
		rno=1;
		marks=95;
		name="Sanket";
		System.out.println("Rno: "+rno);
		System.out.println("Marks: "+marks);
		System.out.println("Name: "+name);
		
	}
}

public class ClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student obj=new student();
		obj.setdata();
	}

}
