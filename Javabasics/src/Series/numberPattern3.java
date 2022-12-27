package Series;

import java.util.Scanner;

public class numberPattern3 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter levels: ");
		int levels=input.nextInt();
		System.out.println("Enter rows: ");
		
		int k=1;
		for(int i=0;i<levels;i++) {
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
			
	}

}
