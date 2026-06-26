package oopspillars;

class gc{
	gc(){
		
		System.out.println("Object is created");
	}
	
	protected void finalize() {
		
		System.out.println("Object is destroyed");
	}
}

public class garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gc a1 = new gc();
		a1 = null;
		
		gc a2 = new gc();
		gc a3 = new gc(); 
		
		a2 = a3;
		
		new gc();
		
		System.gc();
	}

}
