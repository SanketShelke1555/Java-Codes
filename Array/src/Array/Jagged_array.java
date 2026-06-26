package Array;

public class Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int arr[][]= new int[4][];
//		
//		arr[0]= new int[4];
//		arr[1]= new int[3];
//		arr[2]=new int[2];
//		arr[3]=new int[1];
//		
//		
//		for(int i=0;i<4;i++) {
//			
//			for(int j=4;j>i;j--) {
//				
//				System.out.print(" * ");
//			}
//			
//			System.out.println();
//		}
		
		int arr[][]= {{1,2,3},{4,5},{6,7,8,9}};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
		}
	}

}
