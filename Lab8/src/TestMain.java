public class TestMain {
	public static void main(String[] args) {
		if(args.length ==0) {
			System.out.println("Pass a double val!");
			System.exit(0);
		}
		
		double num = Double.parseDouble(args[0]);
		int whole = Integer.parseInt(args[1]);
		double fraction = Double.parseDouble(args[2]);
		whole=DecimalSplitter.getWhole(num);
		fraction=DecimalSplitter.getFraction(fraction);

// complete the statements

		System.out.println("Whole : " + whole);
		System.out.printf("Fraction : %.3f\n" , fraction);

		System.out.println("The number is " + (DecimalSplitter.isOdd(whole) ? "Odd" : "Even"));
	}
}
