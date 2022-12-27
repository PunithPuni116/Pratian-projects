package com.Application;

import java.time.LocalDate;

public class CurrentImpl implements IAccountImpl
{
    public boolean open(Account account) {

        //Declaration
        boolean isOpened = false;

        //Logic
        //Typecast into savings object. I need data from the object
        var current = (Current)account;
        current.setActivatedDate(LocalDate.now());
        current.setActive(true);
        isOpened = true;

        //Return status
        return isOpened;
    }
}
