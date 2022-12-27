
public class TestMain {

	public static void main(String[] args) throws ProductNotFoundException {
		Product p1 = new Product();
		p1.setId(1);
//		p1.setName("Sowmya");
		System.out.println("Product Id: " + p1.getId());
//		System.out.println("Product Name : " + p1.getName());
		
	
		try {
			p1.getName();
		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
