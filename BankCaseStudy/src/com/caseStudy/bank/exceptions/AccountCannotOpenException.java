package com.caseStudy.bank.exceptions;

public class AccountCannotOpenException extends Exception{
	
	
	public AccountCannotOpenException(String message) {
		System.out.println(message);
	}

}
