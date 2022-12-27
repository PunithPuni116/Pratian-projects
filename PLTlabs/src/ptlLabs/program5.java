/*Write a program to store elements into a N * N matrix of integer. Display whether it is a 
symmetric matrix or not. */


package ptlLabs;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		System.out.println("Enter the row size  Square of matrix: ");
		Scanner input=new Scanner(System.in);
		int row=input.nextInt();
		System.out.println("Enter the column size  Square of matrix: ");
		int column=input.nextInt();
		if(row!=column)
			System.out.println("order of the matrix should be same for identity matrix. Plese enter the valid matrix order");
		else
			symmetricMatrixCheck(row);
		
	}
	
	public static void symmetricMatrixCheck(int order) {
			Scanner input=new Scanner(System.in);
			int[][] arr=new int[order][order];
			System.out.println("Enter the elements  Square of matrix: ");
			for(int i=0;i<order;i++)			
				for(int j=0;j<order;j++) {
					arr[i][j]=input.nextInt();
					}
			System.out.print("\n");
			for(int i=0;i<order;i++) {
				for(int j=0;j<order;j++) {
					System.out.print(arr[i][j]+" ");
					}
				System.out.println();
			}
			int flag=0;
			for(int i=0;i<order;i++) {
				for(int j=0;j<order;j++) {
					if(arr[i][j]!=arr[j][i]) {
						flag=1;
						break;
					}
				}
			}
			if(flag==1)
				System.out.println("No it's not Symmetric matrix");
			else
				System.out.print("Yes it is Symmetric matrix");
	}
}
