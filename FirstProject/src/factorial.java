
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3;
		
		long factorial = 1;
		
		int i;
		
		for(i=1;i<=num;i++) {
			
			factorial = factorial * i;
			
		}
		
		System.out.println("Factorial of given number is :" +factorial);

	}

}
