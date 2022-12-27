/*Write a program to store elements into a M * N matrix of integer. Display the matrix and 
its transpose.*/

package ptlLabs;

import java.util.Scanner;

public class program3 {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the row size :");
		int row=input.nextInt();
		System.out.println("Enter the column size :");
		int column=input.nextInt();
		int[][] matrix=new int[row][column];
		System.out.println("Enter the matrix elements :");
		gettingInput(matrix,row,column);
		//for transpose matrix
		int[][] transpose=new int[column][row];
		transpose(matrix,transpose,row,column);
		
	}
	
	public static void gettingInput(int[][] arr,int row,int column) {
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void transpose(int[][] matrix,int[][] arr,int row,int column) {
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[j][i]=matrix[i][j];
				
			}
		}
		System.out.println("Transpose of matrix is :");
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
	}
}
