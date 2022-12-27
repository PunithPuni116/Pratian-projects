package ptlLabs;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		System.out.println("Enter the row size 1st of matrix: ");
		Scanner input=new Scanner(System.in);
		int row1=input.nextInt();
		System.out.println("Enter the column size  1st of matrix: ");
		int column1=input.nextInt();
		System.out.println("Enter the row size 2nd of matrix: ");
		int row2=input.nextInt();
		System.out.println("Enter the column size  2nd of matrix: ");
		int column2=input.nextInt();
		int[][] matrix1=new int[row1][column1];
		int[][] matrix2=new int[row1][column1];
		if(!validChecker(row1,row2,column1,column2)) {
			System.out.println("Matrix dimension should be same to carry out addition or subtraction\n please enter valid dimension");
		}
		else {
			getInput(matrix1,row1,column1,matrix2);
			System.out.println("Addition of given matrix :");
			addition(matrix1,row1,column1,matrix2);
			System.out.println("Subtraction of given matrix :");
			subtraction(matrix1,row1,column1,matrix2);
		}

	}
	
	public static void addition(int[][] matrix1,int row,int column,int[][] matrix2) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix1[i][j]+=matrix2[i][j];
				System.out.print(matrix1[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	public static boolean validChecker(int row1,int row2,int column1,int column2) {
		if(row1==row2 && column1==column2)
			return true;
		return false;
	}
	
	public static void getInput(int[][] matrix1,int row,int column,int[][] matrix2) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the elements of 1st matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix1[i][j]=input.nextInt();
			}
		}
		System.out.println("enter the elements of 2st matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix2[i][j]=input.nextInt();
			}
		}
		
		
	}
	public static void subtraction(int[][] matrix1,int row,int column,int[][] matrix2) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix1[i][j]=matrix1[i][j]-matrix2[i][j]-matrix2[i][j];
				System.out.print(matrix1[i][j]+"  ");
			}
			System.out.println();
		}
	}
	 
	
	

}
