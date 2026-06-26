package oopspillars;


class parent1{
	
	parent1(){
		
		System.out.println("Parent Constructor called");
	}
	
	public void add(int a,int b) {
		
//		int a = 10, b=20;
		int c = a+b;
		System.out.println("Addition:"+c);
		
	}
}
	
	class child1 extends parent1{
		
		child1(){
			
			System.out.println("Child constructor called");
		}
		
		public void add(int x, int y) {
			
			super.add(30,20);   //By this we can call parent class method also.
//			int x=30,y=20;
			int z= x-y;
			System.out.println("Substraction:"+z);
		}
	}

public class overloadingex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 obj=new child1();
		obj.add(30,20);

	}
	
	
}
