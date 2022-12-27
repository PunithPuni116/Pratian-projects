package com.Application;

import java.time.LocalDate;
import java.util.Date;

import com.bank.exceptions.InvalidAgeForOpeningAnAccountException;

public class SavingsImpl implements IAccountImpl {

    public boolean open(Account account) {

        //Declaration
        boolean isOpened = false;

        //Logic
        //Typecast into savings object. I need data from the object
        Savings savings = (Savings)account;

        try {
        	
            int age=savings.getDateOfBirth().getYear();
            if(age<18)
            	throw new InvalidAgeForOpeningAnAccountException("Age is less than 18. Account cannot be opened");
            savings.setActive(true);
            savings.setActivatedDate(LocalDate.now());
            isOpened=true;

        } catch (InvalidAgeForOpeningAnAccountException e) {
            e.printStackTrace();
        }

        //Return status
        return isOpened;
    }
}
