package Basics;
import java.util.Scanner;
public class NumberSeries {

		public static void main(String[] args) {
			int number;
			System.out.println("Enter the number");
			Scanner input=new Scanner(System.in);
			number=input.nextInt();
			for(int i=2;i<=number;i+=2) {
				System.out.print(i*i+" ");
			}
			
		}
}
