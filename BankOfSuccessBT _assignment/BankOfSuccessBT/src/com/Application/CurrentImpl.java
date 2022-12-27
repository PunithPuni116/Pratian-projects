package com.Application;

import java.util.Date;

public class CurrentImpl implements IAccountImpl
{
    public boolean open(Account account) {

        //Declaration
        boolean isOpened = false;

        //Logic
        //Typecast into current object. I need data from the object
        var current = (Current)account;

        //savings.setActivatedDate(new LocalDate(2022, 12, 22));
        current.setActive(true);
        //Set the current date as activated date
        //current.setActivatedDate();
        isOpened = true;

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
