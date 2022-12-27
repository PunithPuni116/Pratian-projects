package com.caseStudy.bank.user;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.caseStudy.bank.Current;
import com.caseStudy.bank.Savings;
import com.caseStudy.bank.exceptions.AccountCannotOpenException;

public class Test {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) throws AccountCannotOpenException, ParseException, SQLException {
		OpeningAccount oa=new OpeningAccount();
		while(true) {
			createAccount(oa);
		}
		
	}
	public static void createAccount(OpeningAccount oa) throws AccountCannotOpenException, ParseException, SQLException {
		System.out.println("Welcome to Bank Of Success!!!!! \n\n");
		
		System.out.println("Create an Account : \n");
		System.out.println("1.To open savings account ");
		System.out.println("2.To open current account \n");
		System.out.println("Enter valid key go ahead :");
		
		int n=input.nextInt();
		switch(n) {
			case 1: oa.openSavingsAccount();;
				break;
			case 2:
				oa.openCurrentAccount();
				break;
		}
	}
}
