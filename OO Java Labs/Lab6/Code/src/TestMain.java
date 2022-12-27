public class TestMain {
	public static void main(String[] args) {
		SwapData obj = new SwapData();

		int arg1 = 0;
		int arg2 = 0;

//Read values of arg1 and arg2 from Console
		Console cn=new Console();
		System.out.println("Enter arg1 value:");
		arg1=cn.readInt();
		System.out.println("Enter arg1 value:");
		arg2=cn.readInt();
		obj.setArg1(arg1);
		obj.setArg2(arg2);

// Call set methods of SwapData object

		obj.displayValues("Before Swapping...");

		obj.swapValues();

		obj.displayValues("After Swapping...");
	}
}
