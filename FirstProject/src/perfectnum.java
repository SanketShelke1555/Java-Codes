
public class perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		
		int sum = 0;
		
		int i;
		
		for(i=1;i<num;i++) {
			
			if(num%i==0) 
				sum = sum +i;		
		}
		
		if(sum==num) {
			System.out.println(num+" This is a Perfect Number");
		}
		else {
			System.out.println(num+" This is not a Perfect Number");
		}

	}

}
