package com.sa.entities;

import com.sa.exception.AccountAlreadyActiveException;
import com.sa.exception.RegistrationNumberNullValueException;

public class CurrentAccount extends Account{
	
	private String companyName;
	private String website;
	private String registrationNo;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	@Override
	public boolean open() throws AccountAlreadyActiveException, RegistrationNumberNullValueException {
		// TODO Auto-generated method stub
		boolean isOpend=false;
		if(this.isActive()) {
			throw new AccountAlreadyActiveException("Account alrewady Active");
		}
		if(this.getRegistrationNo()==null)
			isOpend=true;
		else {
			throw new RegistrationNumberNullValueException("Registration number is null");
		}
		this.setActive(isOpend);
		return isOpend;
		
	}
	
	
}
