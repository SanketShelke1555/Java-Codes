package Array;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int arr3[][]= new int[3][3];
		
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr1[i].length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+ " ");
			}
			
			System.out.println( );
			
		}

	}

}
