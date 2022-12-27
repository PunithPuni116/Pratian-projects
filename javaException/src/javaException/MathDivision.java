package javaException;

public class MathDivision {
	public static void main(String[] args) {
		int num1=10;
		int num2=7;
		
		try {
			double d=(double)(num1/num2);
//			if(d==Double.POSITIVE_INFINITY || d==Double.NEGATIVE_INFINITY)
//				throw new ArithmeticException();
			System.out.println(d);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero operation cannot possible");
			
		}
		
	}
}
