
//1 2 6 15 31 56 92 141 205 286 
package Series;

import java.util.Scanner;

public class Series2 {
	public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int num=1;
	for(int i=0;i<n;i++) {
		num=num+i*i;
		System.out.print(num+" ");
		}
	}
	
}
