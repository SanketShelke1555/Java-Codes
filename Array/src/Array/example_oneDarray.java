package Array;

public class example_oneDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Two ways to declare array
		
		
//		int arr[]= {1,2,3,4,5,6,7,8,9,10,11};
		int i;
		int j;
//		int sum=0;
//		System.out.println("Length="+arr.length);
//		
//		for(i=0;i<arr.length;i++) {
//			
//		sum = sum + arr[i];
//			
//		}
//		System.out.println("Sum= "+sum);
		
		
//		Concatination of 2 array
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {7,8,9,10,11,12};
		int arr3[]= new int[arr1.length+arr2.length];
		
		
		for(i=0;i<arr1.length;i++) {
			arr3[i+1]=arr1[i];
			System.out.print(arr3[i]+" ");
		}
		
		for(j=0;j<arr2.length;j++) {
			arr3[i]=arr2[j];
			System.out.print(arr3[i]+" ");
		}
	} 

}
