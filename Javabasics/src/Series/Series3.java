

//1 5 8 14 27 49 84 141 
package Series;

import java.util.Scanner;

public class Series3 {
	public static void main(String[] args) {
		int n1=1;
		int n2=5;
		int n3=8;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.print(n1+" "+n2+" "+n3+" ");
		for(int i=0;i<n;i++) {
			int num=n1+n2+n3;
			System.out.print(num+" ");
			n1=n2;
			n2=num;
		}
	}

}
