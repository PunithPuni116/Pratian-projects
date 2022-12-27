package com.sa.factoryImp;
import com.sa.entities.CurrentAccount;
import com.sa.entities.IAccount;
import com.sa.entities.SavingsAccount;
import com.sa.exception.InvalidAccountTypeException;

public class AccountFactory {
    
    public static long accNo = 1000;
    
    public static IAccount create(String accType) throws InvalidAccountTypeException {
        
        IAccount account = null;
        
        if(accType != null) {
            if(accType.equals("Savings")) {
                account = new SavingsAccount();
            }
            else if (accType.equals("Current")) {
                account = new CurrentAccount();
            }
            else
                throw new InvalidAccountTypeException("Invalid Account Type..");
            
            account.setAccNo(getAccNo());
        }
        return account;
    }
    
    public static long getAccNo() {
        return accNo++;
    }

}