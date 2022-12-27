package com.caseStudy.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Savings extends Account{
	private LocalDate birthDate;
	private String gender;
	private long phoneNumber;
	public Savings() {
		
	}
	public Savings(String name,LocalDate date ) {
		
		birthDate=date;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void seBirthtDate(LocalDate date) {
		this.birthDate = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return String.valueOf(phoneNumber); 
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
