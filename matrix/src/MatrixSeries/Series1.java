package MatrixSeries;

import java.util.Arrays;
import java.util.Scanner;

public class Series1 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the matrix : ");
		
		int n=input.nextInt();
		int[][] arr=new int[n][n];
		int sum=1;
		int num=0;
		int n1=0,n2=1,n3;
		for(int i=0;i<arr.length;i++) {
			n3=n1+n2;
			for(int j=0;j<arr.length;j++) {
				sum=sum+j*j;
				arr[j][i]=sum;
			}
			n3=n3+2;
			n1=n2;
			n2=n3;
			sum=n3;;
			
			
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		ascending(arr,n);
		
	}
	
	public static void ascending(int[][] matrix,int n) {
		int[] arr=new int[n*4-4];
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 || i==n-1 || i==j || i==n-j-1) && k<n*4-4) {
					arr[k]=matrix[i][j];
					k++;
				}
			}
		}
		for(int i=0;i<n*4-4;i++)
			System.out.print(arr[i]+"   ");
		int m=0;
		Arrays.sort(arr);
		System.out.println("\n");
		for(int i=0;i<n;i++) {
			matrix[0][i]=arr[m];
			m++;
			
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				if(i==j) {
					matrix[i][j]=arr[m];
					m++;
				}
			}
				
		}
		for(int i=1;i<n;i++) {
			matrix[19][i]=arr[m];
			m++;
		}
		for(int i=n-2;i>1;i--) {
			for(int j=n-2;j>1;j--) {
				if(i==j) {
					matrix[i][j]=arr[m];
					m++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
