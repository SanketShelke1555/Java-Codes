
public class exceptionclassex2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			String name = null;
			
			System.out.println(name.toUpperCase());
		}
		
		catch(NullPointerException e){
			
			System.out.println(e.getMessage());
		}
		
		try {
			
			int result = 10/0;
			
		}
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		
	}

}
