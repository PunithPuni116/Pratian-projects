package com.sa.entities;

import java.util.Date;

import com.sa.entities.enums.Privilege;

public abstract class Account implements IAccount{
	private long accNo;
	private String name;
	private String pinNumber;
	private double balance;
	private boolean isActive;
	private Date activatedDate;
	private Date closedDate;
	private Privilege privilege;
	@Override
	 public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deposit(double depositAmount) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setPrivilege(Privilege privilege) {
		
		this.privilege=privilege;
		
	}
	@Override
	public Privilege getPrivilege() {
		
		return privilege;
	}
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
	public Date getActivateDate() {
		
		return activatedDate;
	}
	@Override
	public Date getCloseDate() {
		
		return closedDate;
	}
	@Override
	public void setAccNo(long accNo) {
		
		this.accNo=accNo;
	}
	@Override
	public void setBalance(double balance) {
		
		this.balance=balance;
		
	}
	@Override
	public void setActive(boolean active) {
		
		this.isActive=active;
	}
	@Override
	public void setActivatedDate(Date activatedDate) {
		
		this.activatedDate=activatedDate;
		
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}
	@Override
	public void setPinNumber(String pin) {
		// TODO Auto-generated method stub
		this.pinNumber=pin;
		
	}
	@Override
	public void setClosedDate(Date closedDate) {
		
		this.closedDate=closedDate;
		
	}
	
	
	
}
