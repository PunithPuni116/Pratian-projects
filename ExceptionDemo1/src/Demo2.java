
public class Demo2 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("No arguments passed");
		}
		else {
			try {
			int arg1 = Integer.parseInt(args[0]);
			System.out.println(arg1);
			} catch(NumberFormatException nfe) {
				System.out.println("You passed Invalid number");
			}finally {
				System.out.println("Finally Executed");
			}
		}
		System.out.println("End of main()");

	}
	

}
