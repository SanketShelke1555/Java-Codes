
public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArmstrongNumber
		
		int num = 153,sum=0;
		int n = num;
		
		while(num>0) {
			
			int r = num % 10;
			sum = sum + (r*r*r);
			num = num/10;
	
		}
		if(n==sum) {
			
			System.out.println("Number is a Armstrong number");
		}
		else {
			System.out.println("Not a Aramstrong Number");
		}
			
	}

}
