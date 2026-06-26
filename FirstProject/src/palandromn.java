
public class palandromn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 111,r,sum = 0;
		int n = num;	
		while(num>0)
		{
			r = num%10;
			sum = r+(sum*10);
			num = num/10;
			
		}
		
		if(n==sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
		

	}

}
