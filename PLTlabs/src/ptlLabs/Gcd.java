package ptlLabs;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=input.nextInt();
		System.out.println("Enter the array elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int gcd=arr[0];
		for(int i=0;i<n;i++) {
			gcd=gcdEuclin(gcd,arr[i]);
		}
		System.out.println("Gcd of given array is "+gcd);
	}
	public static int gcdCalculator(int x,int y) {
		if(x==0)
			return y;
		if(y==0)
			return x;
		 if(x>y)
			 return gcdCalculator(x-y,y);
		 return gcdCalculator(x,y-x);
	}
	public static int gcdEuclin(int x,int y) {
		if(y==0)
			return x;
		return gcdEuclin(y,x%y);
	}
}
