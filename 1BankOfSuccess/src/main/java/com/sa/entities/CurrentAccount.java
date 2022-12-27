package com.sa.entities;

import com.sa.exceptions.AccountAlreadyActiveException;
import com.sa.exceptions.RegistrationNumberNullValueException;

public class CurrentAccount extends Account {

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
		boolean isOpened = false;

		if (this.isActive())
			throw new AccountAlreadyActiveException("Account already active");

		if (this.getRegistrationNo() != null) {
			isOpened = true;
		} else {
			throw new RegistrationNumberNullValueException("Registration number is null...");
		}
		this.setActive(isOpened);

		return isOpened;
	}

}
