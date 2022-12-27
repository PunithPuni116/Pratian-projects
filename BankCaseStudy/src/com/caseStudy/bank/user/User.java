package com.caseStudy.bank.user;

import java.util.Date;

import com.caseStudy.bank.Account;
import com.caseStudy.bank.exceptions.AccountCannotOpenException;

public class User {
	
	public void closeAccount(Account s) {
		s.setActive(false);
		System.out.println("your account "+s.getAccountNo()+" is successfully closed on "+new Date());
	}
	
	public void deposits(Double d,Account s)  {
		if(s.isActive()) {
			double balance=s.getBalance()+d;
			s.setBalance(balance);
		}
		else {
			System.out.println("Your account does not have sufficient balance");
		}
	}
	
	public void withdraw(Account s,double d) {
		if(!s.isActive()) {
			System.out.println("Your account is inactive. Withdraw cannot be processed");
			return;
		}
		if(s.getBalance()<d) {
			System.out.println("you have less balance and withdraw cannot be processed");
			return;
		}
		double remaining=s.getBalance()-d;
		s.setBalance(remaining);
		
		System.out.println("Your account no "+s.getAccountNo()+" is dibited for Rs."+d+" on "+ new Date());
	}
}
