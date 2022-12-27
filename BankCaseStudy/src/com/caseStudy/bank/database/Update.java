package com.caseStudy.bank.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.caseStudy.bank.Account;
import com.caseStudy.bank.Savings;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Update {
	public void insertDetails(Savings s) throws SQLException{
	
		
		int accNo=s.getAccountNo();
		String name1=s.getName();
		Date date=java.sql.Date.valueOf(s.getActivateDate());
		String privilage=s.getPrivilage().toString();
		int pin=s.getPin();
		boolean active=s.isActive();
		String type="Savings";
		Date bod=java.sql.Date.valueOf(s.getBirthDate().toString());
		String gender=s.getGender();
		String phone=s.getPhoneNumber();
		double balance=s.getBalance();
		
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/bank?autoReconnect=true&useSSL=false","root","1234");  
		
		System.out.println(java.sql.Date.valueOf(s.getActivateDate()));
		String s1="INSERT INTO account_details(account_no,acc_name,balance,activated_date,pin,isactive,privilage,accountType,birth_date,gender,phoneNumber)Values("+accNo+",'"+name1+"',"+balance+",'"+date+"',"+pin+","+active+",'"+privilage+"'"
				+ ",'"+type+"','"+bod+"','"+gender+"','"+phone+"')";
		java.sql.PreparedStatement stm=con.prepareStatement(s1);
	
		stm.executeUpdate(s1);
		  
		
		
	}
		
		
	
}
