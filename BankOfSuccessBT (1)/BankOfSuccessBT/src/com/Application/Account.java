package com.Application;

import java.time.LocalDate;

//Entity Class - Represent the domain. Store data and pass around
public abstract class Account {

    //Data Members
    private int accountNumber;
    private String accountName;
    private int pinNumber;
    private double balance;
    private boolean isActive;
    private LocalDate activatedDate;
    private LocalDate closedDate;
    private Privilege privilege;
    
   
	private static int autoAccountNumber=1000;
    //Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = autoAccountNumber++;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(LocalDate activatedDate) {
        this.activatedDate = activatedDate;
    }

    public LocalDate getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }
}

//Enum for the Privilege of an account holder
enum Privilege{
    PREMIUM,
    GOLD,
    SILVER
}