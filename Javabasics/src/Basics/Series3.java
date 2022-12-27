package Basics;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=input.nextInt();
		for(int i=1;i<=number;i++) {
			if((i%4)!=0) {
			System.out.print(i*i+" ");
			}
		}
		
	}
}
