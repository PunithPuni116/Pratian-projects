//From Java-1.7
public class Demo3_2 {

	public static void main(String[] args) {
		
			try {
			int arg1 = Integer.parseInt(args[0]);
			System.out.println(arg1);
			} catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
				//System.out.println("Either Number format is Invalid OR Array is empty OR you are accessing invalid index");
				System.out.println("Either Number format is Invalid" + " OR Array is empty OR" + " You are accessing invalid index");
			} 
			finally {
				System.out.println("Finally Executed");
			}
		
		System.out.println("End of main()");

	}
	

}
