package Basics;
import java.util.Scanner;
public class NumberSequence {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.print(i+" ");
		}
		
	}
}
