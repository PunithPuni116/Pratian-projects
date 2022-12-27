package com.sa.manager;
import java.time.LocalDate;
import java.util.HashMap;

import com.sa.entities.CurrentAccount;
import com.sa.entities.IAccount;
import com.sa.entities.SavingsAccount;
import com.sa.entities.enums.Privilege;
import com.sa.exception.AccountAlreadyActiveException;
import com.sa.exception.AgeInvalidException;
import com.sa.exception.InvalidAccountTypeException;
import com.sa.exception.RegistrationNumberNullValueException;
import com.sa.factoryImp.AccountFactory;

public class AccountManager {
    
    private static HashMap<Long, IAccount> allAccounts = new HashMap<Long, IAccount>();
    
    public static boolean open(String name, String accType, String pin, Privilege privilege, LocalDate DateOfBirth, 
            String gender, String phoneNo, String companyName, String website, String registrationNo) throws AccountAlreadyActiveException, AgeInvalidException, RegistrationNumberNullValueException, InvalidAccountTypeException {
        
        IAccount account = AccountFactory.create(accType);
        
        account.setName(name);
        account.setPinNumber(pin);
        account.setPrivilege(privilege);
        
        if(accType.equalsIgnoreCase("Savings")) {
            ((SavingsAccount) account).setDateOfBirth(DateOfBirth);
            ((SavingsAccount) account).setGender(gender);
            ((SavingsAccount) account).setPhoneNo(phoneNo);
        }
        
        else {
            ((CurrentAccount) account).setCompanyName(companyName);
            ((CurrentAccount) account).setWebsite(website);
            ((CurrentAccount) account).setRegistrationNo(registrationNo);
        }
        
        boolean status = account.open();
        long accNo = account.getAccNo();
        
        if(status == true) {
            allAccounts.put(account.getAccNo(), account);
        }
        return false;
        
    }

}