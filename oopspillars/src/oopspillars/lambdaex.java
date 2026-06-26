package oopspillars;

interface Arithmetic{
	
	int operation(int a,int b);
}

public class lambdaex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic a1 = (a,b)->(a+b);
		Arithmetic a2 = (a,b)->(a-b);
		Arithmetic a3 = (a,b)->(a/b);
		Arithmetic a4 = (a,b)->(a*b);
		
		
		System.out.println("Addition:"+a1.operation(100, 200));
		System.out.println("Substraction:"+a2.operation(400, 200));
		System.out.println("Division:"+a3.operation(100, 2));
		System.out.println("Multiplication:"+a4.operation(10, 20));
		
		
	}

}
