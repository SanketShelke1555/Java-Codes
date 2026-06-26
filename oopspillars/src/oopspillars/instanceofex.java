package oopspillars;

public class instanceofex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcceptData(1);
		AcceptData("Sanket");

	}
	
	public static void AcceptData(Object input) {
		
		if(input instanceof Integer) {
			
			System.out.println(input+"is of integer type");
		}
		
		else if(input instanceof String){
			
			System.out.println(input+"is of string");
		}
	}

}
