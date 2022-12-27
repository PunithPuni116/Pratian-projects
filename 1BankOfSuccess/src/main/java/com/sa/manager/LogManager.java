package com.sa.manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import com.sa.entities.TransferData;
import com.sa.entities.enums.TransferMode;
import com.sa.exceptions.AccountDoesNotExistException;
import com.sa.exceptions.InvalidPinNumberException;
import com.sa.exceptions.TransferLogDoesNotExistException;

public class LogManager {
	
	private static HashMap<Long, List<TransferData>> transferLog = new HashMap<Long, List<TransferData>>();
	
	public static void initializeLogForAccount(long accNo) {
		if(transferLog.get(accNo) == null || !transferLog.containsKey(accNo))
		transferLog.put(accNo, new ArrayList<>());
	}
	
	public static boolean logFundTransfer(long fromAccount, long toAccount, double amount, TransferMode mode, LocalDateTime dateTime) {
		initializeLogForAccount(fromAccount);
		
		initializeLogForAccount(toAccount);
		
		TransferData transferData = new TransferData(fromAccount, toAccount, amount, dateTime, mode);
		
		 transferLog.get(fromAccount).add(transferData);
		
		 storeLogData();
		return transferLog.get(fromAccount).indexOf(transferData) == -1 ? false : true;
		 
			
	}
	
	
	private static void storeLogData() {
				BufferedWriter bWriter = null;
				
				try {
					bWriter = new BufferedWriter(new FileWriter("transferlog.log", false));
					for(Long key : transferLog.keySet()) {
						for(TransferData transferData : transferLog.get(key)) {
							bWriter.write(transferData.getFromAccount() + ":" + transferData.getToAccount() +
									":" + transferData.getTransferAmount() + ":" + transferData.getTransferMode() + ":"
									+ transferData.getDateTime());
							bWriter.newLine();
						}
					}
					bWriter.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				
	}
	
	public static double getTotalExpenditureByDate(Long accNo, LocalDateTime dateTime) throws TransferLogDoesNotExistException {
		double total = 0;
		
		if(!dateTime.isAfter(LocalDateTime.now())) {
			if(transferLog.get(accNo) == null || !transferLog.containsKey(accNo)) {
				throw new TransferLogDoesNotExistException("Transfer log does not exist");
			}
			else {
				for(TransferData transferData : transferLog.get(accNo)) {
					
					if(validateTransferLogDate(transferData.getDateTime(),dateTime))
					total += transferData.getTransferAmount();
				}
			}
		}
		
		return total;
		
		
	}

	private static boolean validateTransferLogDate(LocalDateTime dateTime, LocalDateTime dateTime2) {
		
		//both date should be same and time should not be in future
		return dateTime.getYear() == dateTime2.getYear() && dateTime.getMonth() == dateTime2.getMonth()
				&& dateTime.getDayOfMonth() == dateTime2.getDayOfMonth() && dateTime.isBefore(dateTime2) ? true :false;
	}

	public static List<TransferData> getTransferDataByAccNo(long accNo, String pin) throws TransferLogDoesNotExistException, AccountDoesNotExistException, InvalidPinNumberException{
		
		boolean isAuthenticated = AccountManager.authenticatePinNumber(accNo, pin);
		
		List<TransferData> res = null;
		
		if(isAuthenticated) {
			
			if(transferLog.get(accNo) == null || !(transferLog.containsKey(accNo))) {
			throw new TransferLogDoesNotExistException("Transfer log does not exist");
			}
			else {
				res = transferLog.get(accNo);
			}
				
		}
		return res;
	}

	

}
