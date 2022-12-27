package Series;

import java.util.Scanner;

public class numberPattern4 {
	
		
public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter levels: ");
		int levels=input.nextInt();
		System.out.println("Enter rows: ");
		
		int k=0;
		for(int i=0;i<levels;i++) {
			
			for(int j=1;j<=i;j++)
			{	
				k++;
				if((k&1)!=1)
					System.out.print((-k)*k+" ");
				else
					System.out.print(k*k+" ");
				
			}
			System.out.println();
		}
			
	}

}
