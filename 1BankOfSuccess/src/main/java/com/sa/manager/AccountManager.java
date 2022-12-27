package com.sa.manager;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

import com.sa.entities.CurrentAccount;
import com.sa.entities.IAccount;
import com.sa.entities.SavingsAccount;
import com.sa.entities.enums.Privilege;
import com.sa.exceptions.AccountAlreadyActiveException;
import com.sa.exceptions.AccountAlreadyClosedException;
import com.sa.exceptions.AccountDoesNotExistException;
import com.sa.exceptions.AccountNotActiveException;
import com.sa.exceptions.AgeInvalidException;
import com.sa.exceptions.InsufficientBalanceException;
import com.sa.exceptions.InvalidAccountTypeException;
import com.sa.exceptions.InvalidPinNumberException;
import com.sa.exceptions.RegistrationNumberNullValueException;
import com.sa.factoryImpl.AccountFactory;

public class AccountManager {

	private static HashMap<Long, IAccount> allAccounts = new HashMap<Long, IAccount>();

	public static long open(String name, String accType, String pin, Privilege privilege, LocalDate DateOfBirth,
			String gender, String phoneNo, String companyName, String website, String registrationNo)
			throws AccountAlreadyActiveException, AgeInvalidException, RegistrationNumberNullValueException,
			InvalidAccountTypeException {

		IAccount account = AccountFactory.create(accType);
		account.setPinNumber(pin);
		account.setPrivilege(privilege);
		
		if (accType.equalsIgnoreCase("Savings")) {
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

		if (status == true) {
			allAccounts.put(account.getAccNo(), account);
			LogManager.initializeLogForAccount(accNo);
		}
		return accNo;

	}

	public static IAccount getAccountDetailsByAccNo(Long accNo) throws AccountDoesNotExistException {
		IAccount account = null;

		// check if key is present in the hashmap
		if (allAccounts.containsKey(accNo)) {
			account = allAccounts.get(accNo);
		} else {
			throw new AccountDoesNotExistException("Invalid account Number - Account does not exist");
		}

		return account;
	}

	public static boolean authenticatePinNumber(long accNo, String pinNumber)
			throws AccountDoesNotExistException, InvalidPinNumberException {

		boolean status = false;

		IAccount account = getAccountDetailsByAccNo(accNo);

		if (account == null) {
			throw new AccountDoesNotExistException("Account does not exist Exception");
		}

		if (account != null) {
			if (account.getPinNumber().equals(pinNumber)) {
				status = true;
			} else {
				throw new InvalidPinNumberException("You have entered invalid pin number");
			}
		}

		return status;

	}
	
	public static boolean close(long accNo, String pinNumber) throws AccountDoesNotExistException, InvalidPinNumberException, AccountAlreadyClosedException {
		boolean status = false;
		
		if(!authenticatePinNumber(accNo, pinNumber)) {
			throw new InvalidPinNumberException("Entered pin number is invalid");
		}
		
		IAccount account = getAccountDetailsByAccNo(accNo);
		
		if(account != null)
			status = account.close();
			
		return status;
		
	}
	
	public static boolean withdraw(long accNo, String pinNumber, double withdrawAmount) throws InvalidPinNumberException, AccountDoesNotExistException, AccountNotActiveException, InsufficientBalanceException {
		boolean withdraw = false;
		
		if(!authenticatePinNumber(accNo, pinNumber)) {
			throw new InvalidPinNumberException("Entered pin number is invalid");
		}
		
		IAccount account = getAccountDetailsByAccNo(accNo);
		
		if(account != null)
			withdraw = account.withdraw(withdrawAmount);
		
		return withdraw;
	}
	
	public static boolean deposit(long accNo, String pinNumber, double depositAmount) throws AccountNotActiveException, AccountDoesNotExistException, InvalidPinNumberException {
		boolean deposit = false;
		
		if(!authenticatePinNumber(accNo, pinNumber)) {
			throw new InvalidPinNumberException("Entered pin number is invalid");
		}
		
		IAccount account = getAccountDetailsByAccNo(accNo);
		
		if(account != null)
			deposit = account.deposit(depositAmount);
		
		return deposit;
	}
	

}
