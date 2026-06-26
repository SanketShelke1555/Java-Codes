package oopspillars;

interface E1{
	
	public void m1();
}
interface E2{
	public void m2();
}
interface E3 extends E1,E2{
	public void m3();
}

class Iclass implements E3{
	
	public void m1() {
		System.out.println("M1 method");
	}
	
	public void m2() {
		System.out.println("M2 method");
	}
	
	public void m3() {
		System.out.println("M3 method");
	}
}
public class InterfaceextendInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iclass obj=new Iclass();
		
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
