//From Java-1.7
public class Demo3_3 {

	public static void main(String[] args) {
		
			try {
			int arg1 = Integer.parseInt(args[0]);
			System.out.println(arg1);
			MyClass obj = null;
			obj.m1();
			} catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
				//System.out.println("Either Number format is Invalid OR Array is empty OR you are accessing invalid index");
				System.out.println("Either Number format is Invalid" + " OR Array is empty OR" + " You are accessing invalid index");
			} catch (RuntimeException e) { //Generic Exception Handling
				System.out.println("Runtime Exception Encountered");
			} catch(Exception e) { //Generic Exception Handling
				System.out.println("Some Exception was thrown");
			}
			finally {
				System.out.println("Finally Executed");
			}
		
		System.out.println("End of main()");

	}
	

}

class MyClass {
	void m1() {}
}
