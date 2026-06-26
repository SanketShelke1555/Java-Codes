
public class phebonesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 3;
		int a = 0;
		int  b= 1;
//		System.out.print(a+" "+b);
		for(int i=1;i<=num;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}	 
	} 

}
