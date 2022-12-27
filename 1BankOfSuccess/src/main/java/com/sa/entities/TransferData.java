package com.sa.entities;

import java.time.LocalDateTime;

import com.sa.entities.enums.TransferMode;

public class TransferData {

	private long fromAccount;
	private long toAccount;
	private double transferAmount;
	private LocalDateTime dateTime;
	private TransferMode transferMode;
	
	
	
	public TransferData(long fromAccount, long toAccount, double transferAmount, LocalDateTime dateTime,
			TransferMode transferMode) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transferAmount = transferAmount;
		this.dateTime = dateTime;
		this.transferMode = transferMode;
	}
	
	public long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public long getToAccount() {
		return toAccount;
	}
	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}
	public double getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public TransferMode getTransferMode() {
		return transferMode;
	}
	public void setTransferMode(TransferMode transferMode) {
		this.transferMode = transferMode;
	}
	
	
}
