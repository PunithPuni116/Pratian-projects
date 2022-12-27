package Basics;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner input=new Scanner(System.in);
		int number1;
		int number2;
		int temp;
		System.out.println("Enter the number 1");
		number1=input.nextInt();
		
		System.out.println("Enter the number2");
		number2=input.nextInt();
		
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("number1="+number1);
		System.out.println("number2="+number2);
	}
	
	
}

