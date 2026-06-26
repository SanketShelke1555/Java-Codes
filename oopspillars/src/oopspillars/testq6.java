package oopspillars;


class areaa{
	
	areaa(){
		
		System.out.println("Area Constructor Called");
	}
	
	public void area(float r) {
		
		float a = 3.14f * r * r;
        System.out.println("Area of Circle = " + a);
	}
	
	public void area(int side) {
		
		int a = side*side;
		System.out.println("Area of Square:"+a);
	}
	
	public void area(int l,int b) {
		
		int a = l*b;
		System.out.println("Area of Rectangle:"+a);
	}
}
public class testq6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		areaa obj = new  areaa();
		
		obj.area(5.6f);
		obj.area(5);
		obj.area(10, 12);
		
	}

}
