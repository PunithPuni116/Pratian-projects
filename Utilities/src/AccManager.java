public class AccManager {
	public void fillAccountData(Account a1) {
	
	//Complete the statements
		a1.accNo="12";
		a1.name="abc";
		a1.balance=25000;

	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
