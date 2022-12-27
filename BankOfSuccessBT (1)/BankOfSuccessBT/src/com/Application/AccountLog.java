package com.Application;

import java.util.HashMap;

public class AccountLog {
	
	public static HashMap<String,HashMap<Integer,Account>>accountLog=new HashMap<>();
	//public static HashMap<Integer,Account>accounts=new HashMap<>();
	public static HashMap<Integer,Account>savingsAccounts=new HashMap<>();
	public static HashMap<Integer,Account>currentAccounts=new HashMap<>();
	static {
		accountLog.put("savings", savingsAccounts);
		accountLog.put("current", currentAccounts);
	}
	public static void AddAccountToAccountLog(Account account) {
		
		if(account instanceof Savings) {
			Savings savings=(Savings)account;
			savingsAccounts.put(savings.getAccountNumber(), savings);
			
		}
		else {
			Current current=(Current)account;
			currentAccounts.put(current.getAccountNumber(), current);
			
		}
		
	}
	
	public static Account getAccountFromAccountLog(int accountNumber) {
		
		Account savings=(Savings)accountLog.get("savings").get(accountNumber);
		Account current=(Current)accountLog.get("current").get(accountNumber);
		
		if(savings!=null)
			return savings;
		
		else
			return current;
		
		
//		if(accountType.equalsIgnoreCase("savings")) {
//			return (Savings)accountLog.get("savings").get(accountNumber);
//		}
//		else {
//			return (Current)accountLog.get("curent").get(accountNumber);
//			
//		}
	}
	
}
