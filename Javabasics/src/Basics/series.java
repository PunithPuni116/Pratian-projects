package Basics;
import java.util.Scanner;
public class series {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int number;
		int product=1;
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
//		for(int i=1;i<=number;i++) {
//			System.out.print((int)Math.pow(i, i)+" ");
//		}
		long count=0;
		for(int i=1;i<=number;i++) {
			product=1;
			count=i;
			while(count>0) {
				product=i*product;
				count--;
			}
			System.out.print(product+" ");
		}
	}
}
