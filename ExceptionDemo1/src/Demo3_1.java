//Till Java-1.6
public class Demo3_1 {

	public static void main(String[] args) {
		
			try {
			int arg1 = Integer.parseInt(args[0]);
			System.out.println(arg1);
			} catch(NumberFormatException nfe) {
				System.out.println("You passed Invalid number");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Either array is empty or you are accessing invalid index");
			}
			finally {
				System.out.println("Finally Executed");
			}
			
		
		System.out.println("End of main()");

	}
	

}
