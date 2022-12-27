package Series;

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		System.out.println("Enter the size of matrix: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++)			
			for(int j=0;j<n;j++) {
				arr[i][j]=input.nextInt();
				}
		System.out.print("\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
		
		
		int flag=0;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if((arr[i][j]!=1 && i==j )|| (arr[i][j]!=0 && i!=j)) {
					flag=1;
					break;
				}	
					
			}
			
			if(flag==1)
				break;
		}
		if(flag==1)
			System.out.println("No it's not diagonal matrix");
		else
			System.out.print("Yes it is diagonal matrix");
	
	}
	

}
