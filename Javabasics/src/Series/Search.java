package Series;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the numebr to be searched");
		int x=input.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				System.out.println("number found at index "+(i+1));
				break;
			}
		}
		System.out.println("number not found");
	}
}
