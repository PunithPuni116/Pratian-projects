package assignmentTreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;



public class SortAccount {
	public static void main(String[] args) {
		System.out.println("1.Sort AccountId");
		System.out.println("2.Sort Account Name");
		System.out.println("3.Sort Account Balance"+"\n");
		
		int choice=2;
		
		Account account1 = new Account(1001,"Kumar",2000); 
		Account account2 = new Account(1002,"Shanthi", 2000); 
		Account account3 = new Account(1003,"Kavya",2000); 
		Account account4 = new Account(1004,"Mohan",25000); 
		Account account5 = new Account(1005,"Dinesh",25000);
		List<Account>list=new ArrayList<>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		
		switch(choice) {
			case 1:
				TreeSet<Account>treeset=new TreeSet<>(new SortAccountId());
				treeset.addAll(list);
				display(treeset);
				break;
			case 2:
				TreeSet<Account>treeset1=new TreeSet<>(new SortName());
				treeset1.addAll(list);
				break;
			case 3:
				TreeSet<Account>treeset2=new TreeSet<>(new SortBalance());
				treeset2.addAll(list);
				
				display(treeset2);
				break;
					
					
		}
		
					
		
		
	}
	public static void display(TreeSet<Account> tree) {
		for(Account a:tree) {
			System.out.println("Account Id : "+a.getAccountId());
			System.out.println("Account Name : "+a.getName());
			System.out.println("Account Balance : "+a.getBalance()+"\n");
			
			
		}
	}

	
}
