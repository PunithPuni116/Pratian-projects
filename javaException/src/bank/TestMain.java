package bank;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		try {
		Class c1=Class.forName("Account");
		
		Account account=(Account)c1.newInstance();
		}
		catch(ClassNotFoundException e) {
			System.out.print(e);
		}
		catch(InstantiationException e) {
			System.out.print(e);
		}
		catch(IllegalAccessException e) {
			System.out.print(e);
		}
	}
}
