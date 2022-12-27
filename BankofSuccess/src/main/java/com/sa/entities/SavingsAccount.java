package com.sa.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import com.sa.exception.AccountAlreadyActiveException;
import com.sa.exception.AgeInvalidException;

public class SavingsAccount extends Account{
	private LocalDate dateOfBirth;
	private String gender;
	private String phoneNo;
	
	public LocalDate getDateOfbirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfbirth) {
		this.dateOfBirth = dateOfbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public boolean open() throws AccountAlreadyActiveException, AgeInvalidException {
		boolean isOpend=false;
		if(this.isActive()) {
			throw new AccountAlreadyActiveException("Account Already exist");
		}
		isOpend=checkAgeValidity(this.dateOfBirth);
		
		if(isOpend) {
			isOpend=activateAccount(null);
		}
		this.setActive(isOpend);
		return isOpend;
	}
	public boolean checkAgeValidity(LocalDate dateOfbirth) throws AgeInvalidException {
		boolean isValid=false;
		
		int age=Period.between(dateOfbirth, LocalDate.now()).getYears();
		if(age>18) {
			isValid=true;
		}
		else {
			throw new AgeInvalidException("Age should be more than 18");
		}
		return isValid;
	}
	
	public boolean activateAccount(Date activatedDate) {
		boolean activated=false;
		this.setActivatedDate(activatedDate);
		activated=true;
		return activated;
		
	}
	
	
	
	
}
