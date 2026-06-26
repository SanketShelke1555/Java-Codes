
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Interger is wrapper class which stores null values
		
		Integer number = 10 ;
//		Autoboxing: converting int to Integer
		System.out.println("Value of Num is"+number);
		
		int values = number;
//		Unboxing: converting Integer into int
		System.out.println("Value of Num is"+number);
		
//		int is a primitive datatype which does not store null value,by default it stores 0
	
		Integer num = null ;
//		Autoboxing: converting int to Integer
		System.out.println("Value of Num is"+num);
		
		int value = num;
//		Unboxing: converting Integer into int
		System.out.println("Value of Num is"+num);
		
		
	}
}
