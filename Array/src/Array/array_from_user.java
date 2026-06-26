package Array;

import java.util.Scanner;

public class array_from_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rows:");
		int r = sc.nextInt();
		
		System.out.println("Enter Colums:");
		int c = sc.nextInt();
		
		int arr[][]= new int[r][c];
		
		System.out.println("Enter Data:");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				System.out.print(arr[i][j]+" ");
				
			}
			
			System.out.println();
		}
	}

}
