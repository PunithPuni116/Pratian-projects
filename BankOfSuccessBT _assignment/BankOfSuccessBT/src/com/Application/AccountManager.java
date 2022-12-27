package com.Application;

import java.time.LocalDate;
import java.util.Date;

//Control Class - This class is written to manage the activities and rules
//for an account
public class AccountManager {

    //Has-A Account Implementation - But doesn't have the object
    //Has only the instance variable defined
    private IAccountImpl accountImpl;

    public AccountManager(String accType){

        //Instantiating the account implementation with factory
        accountImpl = AccountImplFactory.create(accType);
    }

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

            //IAccountImpl accountImpl = new SavingsImpl();

            //IAccountImpl accountImpl = new CurrentImpl();
            //accountImpl.open();

            isOpened = new SavingsImpl().open(account);
        }
        else if(account instanceof Current){
            isOpened = new CurrentImpl().open(account);
        }
        /*else if(account instanceof Mortgage){

            //Here logic for opening the account
        }
        else if(account instanceof SavingsLoan){

            //Here logic for opening the account
        }*/

        //Here we are satisfying OCP.
        //Why - Any account type in the future below lines need not change
        //IAccountImpl accountImpl = AccountImplFactory.create(accType);
        isOpened = accountImpl.open(account);

        //Add the account to account log when the account is opened
        //Write code here---------------------

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
        //Write code here---------------------

        //Return the status
        return isClosed;
    }

    //Method to withdraw from an account
    public boolean withdraw(Account fromAccount, int pinNumber, double amountToWithdraw) {

        //Declaration
        boolean isWithdrawn = false;

        //Logic to implement account closure. Each logic below should be separate method
        //If account not active or no sufficient funds then raise exception
        //Write code here---------------------

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
        //Write code here---------------------

        //1. Check if to account is active

        //2. Add money and then update the balance

        //3. Update Status
        isDeposited = true;

        //Return the status
        return isDeposited;
    }

    //Method to deposit into account

    public boolean transfer(TransferInfo transferInfo) {

        //Declaration
        boolean isTransferred = false;

        //Logic to implement account closure. Each logic below should be separate method
        //Write code here---------------------

        //1. Both accounts should be active

        //2. From account should have sufficient balance

        //3. Pin number should be valid

        //4. Transfer Limit should be checked
        //Get the limit from Transfer Limit Manager
        //Query the Transfer log and get the transfers made by the account number
        //Check the transfer condition

        //Update Status
        isTransferred = true;

        //Return the status
        return isTransferred;
    }
}

