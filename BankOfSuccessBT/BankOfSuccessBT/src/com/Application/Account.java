package com.Application;
import java.time.LocalDate;
import javax.persistence.*;  

@Entity  
@Table(name = "Bank_accounts")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//Entity Class - Represent the domain. Store data and pass around
public abstract class Account {

    //Data Members
	public static int accNo=1000;
	@Id
    private int accountNumber;
    private String accountName;
    private int pinNumber;
    private double balance;
    private boolean isActive;
    private LocalDate activatedDate;
    private LocalDate closedDate;
    private Privilege privilege;

    //Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = accNo++;
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