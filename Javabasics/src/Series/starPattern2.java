package Series;

import java.util.Scanner;

public class starPattern2 {

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter levels: ");
			int levels=input.nextInt();
			System.out.println("Enter rows: ");
			int rows=input.nextInt();
			for(int i=0;i<levels;i++) {
				for(int j=0;j<=i;j++)
					System.out.print("*");
				System.out.println();
			}
		}
}
