package com.Application;

import java.time.LocalDate;
import java.util.Date;

public class SavingsImpl implements IAccountImpl {

    public boolean open(Account account) {

        //Declaration
        boolean isOpened = false;

        //Logic
        //Typecast into savings object. I need data from the object
        var savings = (Savings)account;

        try {
        	int age=LocalDate.now().getYear()-savings.getDateOfBirth().getYear();
            if(age<18 ) {
                throw new InvalidAgeForOpeningAnAccountException("Invalid Age");
            }
            else {
                //savings.setActivatedDate(new LocalDate(2022, 12, 22));
                savings.setActive(true);
                isOpened = true;
            }

        } catch (InvalidAgeForOpeningAnAccountException e) {
            e.printStackTrace();
        }

        //Return status
        return isOpened;
    }
}
