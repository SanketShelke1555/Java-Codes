package oopspillars;

public class mainmethodoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(String[] args) called");
        
        main(10);      
        main("Sanket"); 
	}
	public static void main(int a) {
        System.out.println("main(int) : " + a);
    }

    
    public static void main(String s) {
        System.out.println("main(String) : " + s);
    }
		

	}





