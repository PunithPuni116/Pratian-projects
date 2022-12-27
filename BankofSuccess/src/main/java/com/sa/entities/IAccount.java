package com.sa.entities;

import java.util.Date;

import com.sa.entities.enums.Privilege;
import com.sa.exception.AccountAlreadyActiveException;
import com.sa.exception.AgeInvalidException;
import com.sa.exception.RegistrationNumberNullValueException;

public interface IAccount {
	long getAccNo();
	
	String getName();
	
	String getPinNumber();
	
	double getBalance();
	
	boolean isActive();
	
	Date getActivateDate();
	
	Date getCloseDate();
	
	void setName(String name);
	
	void setAccNo(long accNo);
	
	void setBalance(double balance);
	
	void setActive(boolean active);
	
	void setActivatedDate(Date activatedDate);
	
	void setClosedDate(Date closedDate);
	
	void setPrivilege(Privilege privilege);
	
	Privilege getPrivilege();
	
	boolean open() throws AccountAlreadyActiveException,AgeInvalidException, RegistrationNumberNullValueException;
	boolean close();
	boolean withdraw(double withdrawAmount);
	boolean deposit(double depositAmount);

	void setPinNumber(String pin);
	
	
}
