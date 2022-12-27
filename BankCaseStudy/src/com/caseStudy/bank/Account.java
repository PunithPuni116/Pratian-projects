package com.caseStudy.bank;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Account {
	public static int incNo=1000;
	private int accountNo;
	private static AtomicInteger atomicAccountNumber=new AtomicInteger(1000);
	private String name;
	private double balance;
	private LocalDate activateDate;
	private int pin;
	private boolean isActive=false;
	private Privilages privilage;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo() {
		this.accountNo=incNo++;
		this.activateDate=LocalDate.now();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getActivateDate() {
		return activateDate;
	}
	public void setActivateDate(LocalDate activateDate) {
		this.activateDate = activateDate;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Privilages getPrivilage() {
		return privilage;
	}
	public void setPrivilage(Privilages privilage) {
		this.privilage = privilage;
	}
	
	
}
