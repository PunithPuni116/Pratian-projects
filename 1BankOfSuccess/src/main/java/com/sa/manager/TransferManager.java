package com.sa.manager;

import java.time.LocalDateTime;

import com.sa.entities.IAccount;
import com.sa.entities.enums.Privilege;
import com.sa.entities.enums.TransferMode;
import com.sa.exceptions.AccountDoesNotExistException;
import com.sa.exceptions.AccountNotActiveException;
import com.sa.exceptions.InsufficientBalanceException;
import com.sa.exceptions.InvalidPinNumberException;
import com.sa.exceptions.ModeInvalidException;
import com.sa.exceptions.TransferLimitExeededException;
import com.sa.exceptions.TransferLogDoesNotExistException;
import com.sa.exceptions.transferAmountInvalidException;

public class TransferManager {
	
	private static TransferManager transferManager = null;
	
	private TransferManager() {
		
	}
	
	public static TransferManager getInstance() {
		if(transferManager == null)
			transferManager = new TransferManager();
		
		return transferManager;
	}
	
	private static boolean checkTransferValidity(IAccount fromAccount, IAccount toAccount, double transferAmount, TransferMode mode, LocalDateTime transferDate) throws AccountDoesNotExistException, AccountNotActiveException, ModeInvalidException, transferAmountInvalidException, InsufficientBalanceException, TransferLogDoesNotExistException, TransferLimitExeededException {
		
		if(fromAccount == null)
			throw new AccountDoesNotExistException("From account does not exist");
		
		if(toAccount == null)
			throw new AccountDoesNotExistException("To account does not exist");
		
		if(!fromAccount.isActive())
			throw new AccountNotActiveException("From Account is not active");
		
		if(!toAccount.isActive())
			throw new AccountNotActiveException("To Account is not active");
		
		if(!(chkModeValidity(mode.toString())))
			throw new ModeInvalidException("Transfer mode specified is invalid");
		
		if(transferAmount <= 0)
			throw new transferAmountInvalidException("Transfer amount should be greater than zero");
		
		if(!(fromAccount.getBalance() >= transferAmount))
			throw new InsufficientBalanceException("Account has insufficient balance to tranfer funds");
		
		long transferLimit = 0;
		
		if(fromAccount.getPrivilege().equals(Privilege.PREMIUM))
			transferLimit = 100000;
		else if(fromAccount.getPrivilege().equals(Privilege.GOLD))
			transferLimit = 50000;
		else if(fromAccount.getPrivilege().equals(Privilege.SILVER))
			transferAmount = 25000;
		
		if(LogManager.getTotalExpenditureByDate(fromAccount.getAccNo(), transferDate) + transferAmount > transferLimit)
			throw new TransferLimitExeededException("Tranfer limit exceeded");
		
		return true;
		
		

	}
	
	public static boolean chkModeValidity(String mode) {
		
		for(TransferMode m : TransferMode.values()) {
			if(m.name().equals(mode)) {
				return true;
			}
		}
		return false;
	}

	public static boolean transferFunds(long fromAccountNo, long toAccountNo, double transferAmount, String pin, TransferMode mode) throws AccountDoesNotExistException, InvalidPinNumberException, AccountNotActiveException, ModeInvalidException, transferAmountInvalidException, InsufficientBalanceException, TransferLogDoesNotExistException, TransferLimitExeededException {
		
		if(!(AccountManager.authenticatePinNumber(fromAccountNo, pin)))
			throw new InvalidPinNumberException("Invaild pin number");
		
		LocalDateTime transferDate = LocalDateTime.now();
		
		IAccount fromAccount = AccountManager.getAccountDetailsByAccNo(fromAccountNo);
		
		IAccount toAccount = AccountManager.getAccountDetailsByAccNo(toAccountNo);
		
		boolean checktransfers = checkTransferValidity(fromAccount, toAccount, transferAmount, mode, transferDate);
		
		if(checktransfers == false)
			return false;
		
		fromAccount.setBalance(fromAccount.getBalance() - transferAmount);
		toAccount.setBalance(toAccount.getBalance() + transferAmount);
		
		LogManager.logFundTransfer(fromAccount.getAccNo(), toAccount.getAccNo(), transferAmount, mode, transferDate);
		
		return true;
	}
}
