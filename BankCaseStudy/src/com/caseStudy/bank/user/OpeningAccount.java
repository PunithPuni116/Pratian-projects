package com.caseStudy.bank.user;

import  com.caseStudy.bank.*;
import com.caseStudy.bank.database.Update;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class OpeningAccount {
	static Scanner input=new Scanner(System.in);
	static Update up=new Update();
	
	public void openSavingsAccount() throws SQLException  {
			Savings s=new Savings();
		//getting name from customer
			s.setAccountNo();
			s.setName(getName());
			s.seBirthtDate(gettingBirthDate());
			s.setGender(gettingGender());
			s.setPhoneNumber(phoneNumber());
			s.setPrivilage(privilages());
			s.setPin(pinNumber());
			
			int age=Period.between(s.getBirthDate(), LocalDate.now()).getYears();
			
			if(age>18) {
				s.setActive(true);
				System.out.println("Account created Successfully on "+s.getActivateDate()+"\n\n");
				System.out.println("Account No : "+s.getAccountNo());
				System.out.println("Account name: "+s.getName());
				System.out.println("privilage :"+s.getPrivilage());
				System.out.println("Mobile number :"+s.getPhoneNumber()+"\n\n");
				up.insertDetails(s);
			}
			else {
				System.out.println("Your less than 18 years of old Account cannot be created\n\n");
			}
			
					
		}
	public void openCurrentAccount() {
		Current c=new Current();
		c.setAccountNo();
		c.setName(getName());
		c.setPrivilage(privilages());
		c.setPin(pinNumber());
		c.setRegistrationNo(getRegNo());
		c.setCompanyName(getCompanyName());
		c.setWebsite(website());
		c.setActive(true);
		System.out.println("Account created Successfully on "+c.getActivateDate()+"\n\n");
		System.out.println("Account No : "+c.getAccountNo());
		System.out.println("Account name: "+c.getName());
		System.out.println("privilage :"+c.getPrivilage());
		System.out.println("company name :"+c.getCompanyName());
		System.out.println("Registration No : "+c.getRegistrationNo()+"\n\n");
		up.insertData(c);
		
	}
	
		
		//To get name from customer
		public String getName() {
			String name;
			while(true) {
				System.out.println("Please Enter Your Name : ");
				name=input.next();
				boolean flag=false;
					for(int i=0;i<name.length();i++) {
						char c=name.charAt(i);
						if(!Character.isAlphabetic(c) ) {
							System.out.println("Name should not consists of digits and special characters");
							flag=true;
							break;
						}
					}
					if(flag)
						continue;
					break;
				}
			return name;
		}
		//To get birth date from customer
	public LocalDate gettingBirthDate() {
		while(true) {
			
			try {
			System.out.println("Enter your Birth date in yyyy-mm-dd format ex: (01-12-2000)");
			String dobString=input.next();
			LocalDate dob=LocalDate.parse(dobString);
			return dob;
			}
			catch(DateTimeParseException e) {
				System.out.println("Please enter the date in yyyy-mm-dd format");
				continue;
				}
			}
		}
	//to get gender from customer
	public String gettingGender() {
		String gender="";
		while(true) {
			System.out.println("Select 1.Male 2.Female");
			int n=input.nextInt();
			if(n==1) {
				gender="male"
						;
				break;
			}
			else if(n==2){
				gender="female";
			}
			else {
				System.out.println("Select valid option");
				continue;
			}	
				
		}
		return gender;
	}
	
	public Privilages privilages() {
		System.out.println("Select the privilages below");
		System.out.println("1.PREMIUM"+"\n"+"2.GOLD"+"\n"+"3.SILVER");
		Privilages p = null;
		int n=input.nextInt();
		while(true) {
			if(n==1) {
				p=Privilages.PREMIUM;break;
			}
			else if(n==2) {
				p=Privilages.GOLD;break;
			}
			else if(n==3) {
				p=Privilages.SILVER;
			}
			else
				continue;
		}
		return p;
	}
		public int pinNumber() {
			String pin;
			int pinNumber;
			System.out.println("Generate your pin. It should be minimum of 4 digits");
			
			while(true) {
				try {
					pin=input.next();
					pinNumber=Integer.parseInt(pin);
					return pinNumber;
				}
				catch(Exception e) {
					System.out.println("Enter valid pin ");
					continue;
				}
			}
		}
		public long phoneNumber() {
			String number;
			long phoneNumber;
			System.out.println("Enter your phone number :");
			
			while(true) {
				try {
					number=input.next();
					phoneNumber=Long.parseLong(number);
					return phoneNumber;
				}
				catch(Exception e) {
					System.out.println("Enter valid phone number ");
					continue;
				}
			}
		}
		
		public String getCompanyName() {
			System.out.println("Enter the company name");
			String companyName=input.next();
			return companyName;
			
		}
		public String website() {
			System.out.println("Enter company's website");
			String companyWebsite=input.next();
			return companyWebsite;
		}
		public long getRegNo() {
			String register;
			long registerNo;
			System.out.println("Generate your pin. It should be minimum of 4 digits");
			
			while(true) {
				try {
					register=input.next();
					registerNo=Long.parseLong(register);
					return registerNo;
				}
				catch(Exception e) {
					System.out.println("Enter valid phone number ");
					continue;
				}
			}
		}
	
}
