package com.bank.main;

import com.Application.AccountForm;
import com.bank.exceptions.InvalidInputException;
import com.bank.exceptions.InvalidPinNumberException;

//This is the main entry point to the application
//Boundary Class
public class Main {

    public static void main(String[] args) throws InvalidInputException, InvalidPinNumberException {
	    // write your code here

        //Load the application form
        AccountForm form = new AccountForm();
        form.loadForm();

    }
}
