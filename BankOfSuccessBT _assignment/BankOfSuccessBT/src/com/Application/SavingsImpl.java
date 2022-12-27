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
            //Correct this logic
            if((new Date().getYear() - savings.getDateOfBirth().getYear()) < 18 ) {
                throw new InvalidAgeForOpeningAnAccountException("Invalid Age");
            }
            else {
                //Set the current date as activated date
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

    public boolean close(Account account) {

        //Declaration
        boolean isClosed = false;



        //Return status
        return isClosed;
    }
}
