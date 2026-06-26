package Array;

import java.util.Arrays;

public class Sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,5,8,7,2,4,1,6};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
		System.out.println("Sorted array:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+ " ");
		}
		

		int arr2[]= {90,50,70,60,20,40,10};
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
