package oopspillars;

interface I1{
	
	public void registration();
	public void batchallotment();
	public void cardgeneration();
	
}

class interfaceclass implements I1{
	
	public void registration() {
		
		System.out.println("Registration method called");
	}
	
	public void batchallotment() {
		
		System.out.println("Batchallotment method called");
		
	}
	
	public void cardgeneration() {
		
		System.out.println("Cardgeneration method called");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfaceclass obj = new interfaceclass();
		obj.batchallotment();
		obj.cardgeneration();
		obj.registration();

	}
	
	

}
