package Basics;

import java.util.Scanner;

public class SwapWithoutTemp {
	public static void main(String[] args) {
	System.out.println("Enter the numbers");
	Scanner input=new Scanner(System.in);
	int number1;
	int number2;
	System.out.println("Enter the number 1");
	number1=input.nextInt();
	
	System.out.println("Enter the number2");
	number2=input.nextInt();
	
	number1=number1^number2;
	number2=number2^number1;
	number1=number1^number2;
	System.out.println("number1="+number1);
	System.out.println("number2="+number2);
	}
}
