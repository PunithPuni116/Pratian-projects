/*	 * 
	*** 
   ***** 
  *********/
package ptlLabs;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number levels :");
		int levels=input.nextInt();
		int k=1;
		
		for(int i=levels;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			int n=0;
			while(n<k) {
				System.out.print("*");
				n++;
			}
			k+=2;
			
			System.out.println();
			
		}
		
	}
}
