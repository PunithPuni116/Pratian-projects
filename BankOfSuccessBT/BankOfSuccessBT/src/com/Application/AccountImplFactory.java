package com.Application;

public class AccountImplFactory {

    public static IAccountImpl create(String accType){

        IAccountImpl accountImpl = null;

        if(accType.equalsIgnoreCase("Savings")){
            accountImpl = new SavingsImpl();
        }
        else if(accType.equalsIgnoreCase("Current")){
            accountImpl = new CurrentImpl();
        }

        return accountImpl;
    }
}
