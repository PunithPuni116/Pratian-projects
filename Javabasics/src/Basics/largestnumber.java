package Basics;
import java.util.Scanner;
public class largestnumber {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		int num1;
		int num2;
		int num3;
		Scanner input=new Scanner(System.in);
		
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1+" is the largest number");
		}
		else if(num2>=num3 && num2>=num1) {
			System.out.println(num2+" is the largest number");
		}
		else
			System.out.println(num3+" is the largest number");
			
	}
}
