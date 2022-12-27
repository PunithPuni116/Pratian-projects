/*Write a program to store N elements in an array of integer. Display the elements. Sort the 
elements. Accept a number to be searched. Display whether the number is found or not in the 
array using BINARY SEARCH.*/ 

package ptlLabs;

import java.util.Scanner;

public class Program2 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=input.nextInt();
		int[] arr=new int[n];
		
		//getting input
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		
		System.out.println("Enter the number to be searched :");
		int x=input.nextInt();
		
		int check=binarySearch(arr,x);
		if(check==-1)
			System.out.println("Number does not found");
		else
			System.out.println("Number found at position : "+(check+1));
		
		
	}
	
	public static int binarySearch(int[] arr,int x) {
		int high=arr.length-1;
		int low=0;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
		
	}
}
