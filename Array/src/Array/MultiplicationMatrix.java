package Array;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				System.out.printf("%4d",i*j);
			}
			
			System.out.println();
		}
	}

}
