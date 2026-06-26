package oopspillars;

class area{
	
	area(){
		
		System.out.println("Parent constructor called");
	}
	
	public void areaT(){
		
		int a = 10 ; int b= 10 ;
		
		double AreaT=0.5*a*b;
		
		System.out.println("Area of triangle:"+AreaT);
		
	}
}

class areacircle extends area{
	
	areacircle(){
		
		System.out.println("Circle Constructor called");
	}
	
	public void areaT() {
		
		int a = 10;
		super.areaT();
		double AreaC = 3.14 * a*a;
		System.out.println("Area of circle:"+AreaC);
	}
}

public class methodoverloadingex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		areacircle obj = new areacircle();
		
		obj.areaT();
	}

}
