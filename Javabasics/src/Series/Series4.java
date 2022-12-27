//1 2 4 6 7 10 10 14 
package Series;

import java.util.Scanner;

public class Series4 {

		public static void main(String[] args) {
			
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			int n1=1;
			int n2=2;
			System.out.print(n1+" "+n2+" ");
			for(int i=1;i<n/2;i++) {
				
				n1=n1+3;
				n2=n2+4;
				System.out.print(n1+" "+n2+" ");
			}
				
			
		}
}

