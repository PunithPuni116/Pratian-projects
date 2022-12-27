package Basics;

import java.util.Scanner;

public class series4 {
	
	public static void main(String[] args) {
		int x=1;
		int y=4;
		int z=7;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n<=3) {
			if(n==1)
				System.out.print(1+" ");
			else if(n==2)
				System.out.print(1+" "+4+" ");
			else
				System.out.print(1+" "+4+" "+7);
		}
		else
		{	
			System.out.print(1+" "+4+" "+7+" ");
			for(int i=0;i<n;i++) {
				int k=x+y+z;
				System.out.print(k+" ");
				x=y;
				y=z;
				z=k;
			}
		}
	}
}
