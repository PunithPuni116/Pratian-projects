package com.sa.entities;

import java.util.Date;

import com.sa.entities.enums.Privilege;
import com.sa.exceptions.AccountAlreadyClosedException;
import com.sa.exceptions.AccountNotActiveException;
import com.sa.exceptions.InsufficientBalanceException;

public abstract class Account implements IAccount {

	private long accNo;
	private String name;
	private String pinNumber;
	private double balance;
	private boolean isActive;
	private Date activatedDate;
	private Date closedDate;
	private Privilege privilege;

	@Override
	public long getAccNo() {
		return accNo;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPinNumber() {
		return pinNumber;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public boolean isActive() {
		return isActive;
	}

	@Override
	public Date getActivatedDate() {
		return activatedDate;
	}

	@Override
	public Date getClosedDate() {
		return closedDate;
	}

	@Override
	public void setAccNo(long accNo) {
		this.accNo = accNo;

	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	@Override
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void setActive(boolean active) {
		this.isActive = active;

	}

	@Override
	public void setActivatedDate(Date activatedDate) {
		this.activatedDate = activatedDate;

	}

	@Override
	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;

	}

	@Override
	public Privilege getPrivilege() {
		return privilege;
	}

	@Override
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;

	}

	@Override
	public boolean close() throws AccountAlreadyClosedException {
		boolean isClosed = false;

		if (!this.isActive)
			throw new AccountAlreadyClosedException("Account already closed");

		this.setActive(false);
		isClosed = true;

		return isClosed;
	}

	@Override
	public boolean withdraw(double withdrawAmount) throws AccountNotActiveException, InsufficientBalanceException {
		boolean withdraw = false;

		if (!this.isActive)
			throw new AccountNotActiveException("Account not Active cannot withdraw amount");

		if (this.balance >= withdrawAmount) {
			this.balance -= withdrawAmount;
			withdraw = true;
		} else {
			throw new InsufficientBalanceException("Amount you are withdrawing is greater than balance amount");
		}
		return withdraw;
	}

	@Override
	public boolean deposit(double depositAmount) throws AccountNotActiveException {
		boolean deposit = false;

		if (!this.isActive)
			throw new AccountNotActiveException("Account not Active cannot deposit amount");

		this.balance += depositAmount;

		deposit = true;

		return deposit;
	}

}
