package com.Application;

import java.time.LocalDate;
import java.util.Date;

public class CurrentImpl implements IAccountImpl
{
    public boolean open(Account account) {

        //Declaration
        boolean isOpened = false;

        //Logic
        //Typecast into savings object. I need data from the object
        Current current = (Current)account;
        if(current.getRegistrationNumber()!=null) {
        	current.setActive(true);
        	current.setActivatedDate(LocalDate.now());
        	isOpened=true;
        }
        //savings.setActivatedDate(new LocalDate(2022, 12, 22));

        //Return status
        return isOpened;
    }
}
