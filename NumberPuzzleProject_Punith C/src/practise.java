
public class practise {
	
	public static void main(String[] args) {
		int[][] arr=new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				arr[0][i]=1;
				arr[i][0]=1;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}
