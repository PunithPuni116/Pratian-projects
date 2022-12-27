package assignment1;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		Account account1 = new Account(1001,"Kumar",2000); 
		Account account2 = new Account(1002,"Shanthi", 2000); 
		Account account3 = new Account(1003,"Kavya",2000); 
		Account account4 = new Account(1004,"Mohan",25000); 
		Account account5 = new Account(1005,"Dinesh",25000);
		ArrayList<Account>list=new ArrayList<>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		BankApp bankApp=new BankApp();
		bankApp.setAccountList(list);
		System.out.println(bankApp.checkEquality(list));
		
	}
}
