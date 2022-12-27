package Basics;

import java.util.Scanner;

public class series5 {
	
	public static void main(String[] args) {
		int  number;
		System.out.println("Enter the number");
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		int x=1; int k=1;
		
		for(int i=1;i<=number;i++) {
			if((k%3)!=0 || i==1) {
				System.out.print((x)+" ");
				x=x+(4*k);
				
			}
			k++;
		}
	}
}
