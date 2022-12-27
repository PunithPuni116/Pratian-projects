/*Write a program to store N elements in an array of integer. Display the elements. Accept a 
number to be searched. Display whether the number is found or not in the array (LINEAR 
SEARCH).*/

package ptlLabs;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		int num;
		int x;
		System.out.println("Enter the size of array: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
			arr[i]=input.nextInt();
		
		System.out.println("Enter the number to be searched: ");
		x=input.nextInt();
		int check=linearSearch(arr,x);
		if(check==-1)
			System.out.println("Number does not found");
		else
			System.out.println("Number found at position "+(check+1));
		
	}
	
	public static int linearSearch(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				return i;
		}
		return -1;
		
	}
}
