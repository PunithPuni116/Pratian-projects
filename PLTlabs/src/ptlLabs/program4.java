/*Write a program to store elements into a N * N matrix of integer. Display whether it is an 
identity matrix or not.*/

package ptlLabs;

import java.util.Scanner;

public class program4 {

		public static void main(String[] args) {
			System.out.println("Enter the row size  Square of matrix: ");
			Scanner input=new Scanner(System.in);
			int row=input.nextInt();
			System.out.println("Enter the column size  Square of matrix: ");
			int column=input.nextInt();
			if(row!=column)
				System.out.println("order of the matrix should be same for identity matrix. Plese enter the valid matrix order");
			else
				identityMatricCheck(row);
		}
		
		public static void identityMatricCheck(int order) {
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
					if((arr[i][j]!=1 && i==j )|| (arr[i][j]!=0 && i!=j)) {
						flag=1;
						break;
					}	
						
				}
				
			}
			System.out.println();
			if(flag==1)
				System.out.println("No it's not identity matrix");
			else
				System.out.print("Yes it is identity matrix");
		
		
		}
	}



