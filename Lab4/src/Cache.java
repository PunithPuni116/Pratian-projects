public class Cache {
	private static int MAX_CAPACITY = 0;
	
	// Implement static block
	static {
		MAX_CAPACITY=Console.readInt();
	}
	//Cache(){MAX_CAPACITY++;}
	static int getMaxCapacity() {
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
	}
}