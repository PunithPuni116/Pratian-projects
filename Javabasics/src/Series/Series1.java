//1 1 2 3 5 8 13 21 
package Series;
import java.util.Scanner;
public class Series1 {

		public static void main(String[] args) {
			int n1=0;
			int n2=1;
			int n3;
			Scanner input=new Scanner(System.in);
			int length=input.nextInt();
			System.out.print(n2+" ");
			for(int i=2;i<=length;i++) {
				n3=n2+n1;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;
			}
				
		}
		
		
}
