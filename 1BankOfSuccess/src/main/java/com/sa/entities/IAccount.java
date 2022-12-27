package com.sa.entities;

import java.util.Date;

import com.sa.entities.enums.Privilege;
import com.sa.exceptions.AccountAlreadyActiveException;
import com.sa.exceptions.AccountAlreadyClosedException;
import com.sa.exceptions.AccountNotActiveException;
import com.sa.exceptions.AgeInvalidException;
import com.sa.exceptions.InsufficientBalanceException;
import com.sa.exceptions.RegistrationNumberNullValueException;

public interface IAccount {
	
	long getAccNo();
	
	String getName();
	
	String getPinNumber();
	
	double getBalance();
	
	boolean isActive();
	
	Date getActivatedDate();
	
	Date getClosedDate();
	
	Privilege getPrivilege(); 
	
	void setAccNo(long accNo);
	
	void setName(String name);
	
	void setPinNumber(String pinNumber);
	
	void setBalance(double balance);
	
	void setActive(boolean active);
	
	void setActivatedDate(Date activatedDate);

	void setClosedDate(Date closedDate);
	
	void setPrivilege(Privilege privilege);
	
	boolean open() throws AccountAlreadyActiveException, AgeInvalidException, RegistrationNumberNullValueException;
	
	boolean close() throws AccountAlreadyClosedException;
	
	boolean withdraw(double withdrawAmount) throws AccountNotActiveException, InsufficientBalanceException;
	
	boolean deposit(double depositAmount) throws AccountNotActiveException;
	
}


