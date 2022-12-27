package Basics;
import java.util.Scanner;
public class sumOfOddNumbers {
	
	public static void main(String[] args) {
		int number;
		int sum=0;
		System.out.println("Enter the number");
		
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		if((number&1)==1)
			number=(number/2)+1;
		else
			number=number/2;
		System.out.println(number*number);
	}
}
