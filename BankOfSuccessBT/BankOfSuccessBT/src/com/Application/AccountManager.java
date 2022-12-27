package com.Application;

import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.bank.database.HibernateUtil;
import com.bank.exceptions.AccountAlreadyClosedException;
import com.bank.exceptions.InvalidAgeForOpeningAnAccountException;
import com.bank.exceptions.InvalidPinNumberException;

//Control Class - This class is written to manage the activities and rules
//for an account
public class AccountManager {

    //Method to open an account
    public boolean open(Account account, String accType) throws InvalidAgeForOpeningAnAccountException {

        //Declaration
        boolean isOpened = false;

        //Logic to open an account - Savings or Current
        //OCP - Open Closed Principle
        //A class should be open for extension but closed for modification
        //This is not satisfying OCP
        //Solution - Runtime Polymorphism
        //Strategy Design Pattern

        //Program to an interface and not to implementation
        //Expose Abstractions and hide Implementations
        /*if(account instanceof Savings){
            isOpened = new SavingsImpl().open(account);
        }
        else if(account instanceof Current){
            isOpened = new CurrentImpl().open(account);
        }*/
        /*else if(account instanceof Mortgage){

            //Here logic for opening the account
        }
        else if(account instanceof SavingsLoan){

            //Here logic for opening the account
        }*/

        //Here we are satisfying OCP.
        //Why - Any account type in the future below lines need not change
        IAccountImpl accountImpl = AccountImplFactory.create(accType);
        isOpened = accountImpl.open(account);

        //Return the status
        return isOpened;
    }

    //Method to open an account
    public boolean close(Account account, String accType) {

        //Declaration
        boolean isClosed = false;

        //Logic to implement account closure
        //Check if account is already closed. If closed then throw exception
        //If not then set the closed date to current date
        //Set the isactive status to false

        //Return the status
        return isClosed;
    }

    //Method to withdraw from an account
    public boolean withdraw(Account fromAccount, int pinNumber, double amountToWithdraw) {

        //Declaration
        boolean isWithdrawn = false;

        //Logic to implement account closure. Each logic below should be separate method
        //If account not active or no sufficient funds then raise exception

        //1. Check if from account is active

        //2. Check if funds are there in the account

        //3. Deduct money and then update the balance

        //4. Update Status
        isWithdrawn = true;

        //Return the status
        return isWithdrawn;
    }

    //Method to deposit into account
    public boolean deposit(Account toAccount, double amountToDeposit) {

        //Declaration
        boolean isDeposited = false;

        //Logic to implement account closure. Each logic below should be separate method
        //If account not active or no sufficient funds then raise exception

        //1. Check if to account is active

        //2. Add money and then update the balance

        //3. Update Status
        isDeposited = true;

        //Return the status
        return isDeposited;
    }

	protected boolean pinNumberValidate(int accountNumber) throws InvalidPinNumberException {
	    	
	    	Scanner input=new Scanner(System.in);
	    	int pinNumber;
	    	try {
	    		
	    		System.out.println("Enter the pin number :");
	    		pinNumber=input.nextInt();
		    	HibernateUtil hibernate=new HibernateUtil();
		    	Account account=hibernate.getAccountData(accountNumber);
		    	
		    	if(account.getPinNumber()!=pinNumber)
		    		throw new InvalidPinNumberException("Pin number is wrong ");
		    	return true;
	    	}
	    	catch(InputMismatchException e) {
	    		System.out.println("Error : Enter valid Account or pin number");
	    	}
	    	catch(InvalidPinNumberException e) {
	    		System.out.println(e.getMessage());
	    	}
	    	return false;
	    	
	    }
	
	public boolean checkAccountisActive(int accountNumber) {
    	HibernateUtil hbUtil=new HibernateUtil();	
    	AccountManager accountManager=new AccountManager();
    	Account account=hbUtil.getAccountData(accountNumber);
    	return account.isActive();
    		
    	
	}
}
