package Array;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrixarr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int rows= matrixarr.length;
		int colms = matrixarr[0].length;
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<colms;j++) {
				
				System.out.print(matrixarr[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<rows;i++) {
			
			int sumrows=0;
			
			for(int j=0;j<colms;j++) {
				
				sumrows +=matrixarr[i][j];
			}
			
			System.out.println("Row no."+(i+1)+" sum is: "+sumrows);
		}
		
		for(int j=0;j<colms;j++) {
			
			int sumcolms=0;
			
			for(int i=0;i<rows;i++) {
				
				sumcolms += matrixarr[i][j];
			}
			
			System.out.println("Colmn no."+(j+1)+" sum is: "+sumcolms);
		}

	}

}
