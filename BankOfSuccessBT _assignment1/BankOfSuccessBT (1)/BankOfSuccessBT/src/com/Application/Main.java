package com.Application;

//This is the main entry point to the application
//Boundary Class
public class Main {

    public static void main(String[] args) throws InvalidInputException, InvalidPinNumberException, AccountNotActiveException, InsufficientBalanceException {
	    // write your code here

        //Load the application form
        var form = new AccountForm();
        form.loadForm();

    }
}
