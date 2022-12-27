package com.sa.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import com.sa.exceptions.AccountAlreadyActiveException;
import com.sa.exceptions.AgeInvalidException;


public class SavingsAccount extends Account {

	private LocalDate dateOfBirth;
	private String gender;
	private String phoneNo;

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
		boolean isOpened = false;

		// Checking if account is already opened //already Active
		if (this.isActive()) {
			throw new AccountAlreadyActiveException("Account already Active..");
		}

		// Check if age > 18
		// Take DOB and less then current date > 18
		isOpened = checkAgeValidity(this.dateOfBirth);

		// Activate the account - by setting the activated date
	
		if (isOpened== true) {
			activateAccount(getActivatedDate());
		}
		else {
			activateAccount(null);
		}
		
		this.setActive(isOpened);
		//Or
		
//		if(!isOpened) {
//			isOpened = activateAccount(getActivatedDate());
//		}
//		this.setActive(true);
		return isOpened;
	}

	public boolean checkAgeValidity(LocalDate dateOfBirth) throws AgeInvalidException {
		boolean isValid = false;

		// check if age >18
		Period period = Period.between(dateOfBirth, LocalDate.now());
		int diffInYrs = period.getYears();

		if (diffInYrs > 18) {
			isValid = true;
		} else {
			throw new AgeInvalidException("Age should be more than 18");
		}
		return isValid;

	}

	public boolean activateAccount(Date activatedDate) {
		boolean activated = false;

		this.setActivatedDate(activatedDate);
		activated = true;

		return activated;

	}

}
