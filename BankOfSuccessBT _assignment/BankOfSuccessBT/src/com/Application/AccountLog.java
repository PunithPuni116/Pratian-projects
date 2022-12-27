package com.Application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountLog {

    private static Map<String, List<Account>> accounts = new HashMap<String, List<Account>>();

    public static void addAccountToLog(String accType, Account account){

        //Write Logic here to add the newly added account to account log

        //Get the list of accounts for the account type and then add the new account received
        //Write code here---------------------
    }

    public static List<Account> getAccounts(String accType){

        //Write code here---------------------
        return null;
    }

}
