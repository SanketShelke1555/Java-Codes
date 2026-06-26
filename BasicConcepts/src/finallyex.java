
public class finallyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String name = null;
			
			System.out.println("Length="+name.length());
		}
		catch(NullPointerException e){
			
			System.out.println(e);
		}
		
		finally {
			
			try {
				
				int a=10,b=0,c;
				
				c=a/b;
				
				System.out.println("Result="+c);
			}
			catch(ArithmeticException e) {
				
				System.out.println(e);
			}
			
			finally {
				
				System.out.println("Executable Block");
			}
		}
	}

}
