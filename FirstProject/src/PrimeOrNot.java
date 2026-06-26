
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i;
		int num = 10;
		
		for(i=2;i<=num;i++){
			
			if(num%i==0)
			break;	
		}
		
		if(i==num){
			System.out.println("This is a Prime Number");
			
		}	
		else {
			System.out.println("This is not a Prime Number");
		}
		
	}

}
