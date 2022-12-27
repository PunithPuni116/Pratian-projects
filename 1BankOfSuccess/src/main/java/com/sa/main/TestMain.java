package com.sa.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

import com.sa.entities.CurrentAccount;
import com.sa.entities.IAccount;
import com.sa.entities.SavingsAccount;
import com.sa.entities.TransferData;
import com.sa.entities.enums.Privilege;
import com.sa.entities.enums.TransferMode;
import com.sa.exceptions.AccountAlreadyActiveException;
import com.sa.exceptions.AccountAlreadyClosedException;
import com.sa.exceptions.AccountDoesNotExistException;
import com.sa.exceptions.AccountNotActiveException;
import com.sa.exceptions.AgeInvalidException;
import com.sa.exceptions.InsufficientBalanceException;
import com.sa.exceptions.InvalidAccountTypeException;
import com.sa.exceptions.InvalidPinNumberException;
import com.sa.exceptions.ModeInvalidException;
import com.sa.exceptions.RegistrationNumberNullValueException;
import com.sa.exceptions.TransferLimitExeededException;
import com.sa.exceptions.TransferLogDoesNotExistException;
import com.sa.exceptions.transferAmountInvalidException;
import com.sa.manager.AccountManager;
import com.sa.manager.LogManager;
import com.sa.manager.TransferManager;

public class TestMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InvalidAccountTypeException {

		char repeat = 'y';
		int choice;

		do {
			System.out.println("1. Open an Account");
			System.out.println("2. Close Existing Account");
			System.out.println("3. Withdraw funds");
			System.out.println("4. Deposit Funds");
			System.out.println("5. Show Account Details");
			System.out.println("6. Transfer Funds");
			System.out.println("7. View Transfer Log");
			System.out.println("8. Exit");
			System.out.println("Enter your choice..");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				openNewAccount();
				break;

			case 2:
				closeExistingAccount();
				break;

			case 3:
				withdrawFunds();
				break;

			case 4:
				depositFunds();
				break;

			case 5:
				showAccountDetails();
				break;

			case 6:
				transferFunds();
				break;

			case 7:
				viewTransferFunds();
				break;

			case 8:
				repeat = 'n';
				break;

			default:
				System.out.println("Wrong Input!");
			}
		} while (repeat == 'y' || repeat == 'Y');

	}

	private static void viewTransferFunds() {
		System.out.println("Enter Account Number");
		long accNo = sc.nextLong();
		
		System.out.println("Enter the pin");
		String pin = sc.next();
		sc.nextLine();
		
		List<TransferData> transfers;
		
		try {
			transfers = LogManager.getTransferDataByAccNo(accNo, pin);
			for(TransferData transferData : transfers) {
				System.out.println("From Account : " + transferData.getFromAccount() + "," + "To Account : " + transferData.getToAccount()
				+ "," + "Transfer Amount : " + transferData.getTransferAmount() + "," + "Transfer Mode : " + transferData.getTransferMode() 
				+ "," + "Transfer Date : " + transferData.getDateTime());
			}
		} catch (TransferLogDoesNotExistException | AccountDoesNotExistException | InvalidPinNumberException e) {
			System.out.println(e.getMessage());
		}
		

	}

	private static void transferFunds() {
		System.out.println("Enter sender account number");
		long senderAccNo = sc.nextLong();

		System.out.println("Enter recipient account number");
		long recAccNo = sc.nextLong();

		System.out.println("Enter the amount to be transfered");
		double amount = sc.nextDouble();

		System.out.println("Enter mode of transfer");
		String mode = sc.next();
		

		System.out.println("Enter pin of sender account");
		String pin = sc.next();
		sc.nextLine();

		try {
			TransferManager.transferFunds(senderAccNo, recAccNo, amount, pin, TransferMode.valueOf(mode));
		} catch (AccountDoesNotExistException | InvalidPinNumberException | AccountNotActiveException
				| ModeInvalidException | transferAmountInvalidException | InsufficientBalanceException
				| TransferLogDoesNotExistException | TransferLimitExeededException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void showAccountDetails() {
		System.out.println("Enter Account Number");
		long accNo = sc.nextLong();

		System.out.println("Enter pin number");
		String pin = sc.next();
		sc.nextLine();

		boolean isAuthenticated = false;

		try {
			isAuthenticated = AccountManager.authenticatePinNumber(accNo, pin);
		} catch (AccountDoesNotExistException | InvalidPinNumberException e) {
			System.out.println(e.getMessage());
		}

		if (isAuthenticated) {
			IAccount account;
			try {
				account = AccountManager.getAccountDetailsByAccNo(accNo);
				System.out.println("Account Holder Name : " + account.getName());
				System.out.println("Privilege : " + account.getPrivilege());
				System.out.println("Account balance : " + account.getBalance());
				System.out.println("Is Account Active : " + account.isActive());
				System.out.println("Activated Date : " + account.getActivatedDate());

				if (account instanceof SavingsAccount) {
					SavingsAccount sa = (SavingsAccount) account;
					System.out.println("Date of Birth : " + sa.getDateOfBirth());
					System.out.println("Gender : " + sa.getGender());
					System.out.println("Phone Number : " + sa.getPhoneNo());

				} else if (account instanceof CurrentAccount) {
					CurrentAccount ca = (CurrentAccount) account;
					System.out.println("Company Name : " + ca.getCompanyName());
					System.out.println("Website : " + ca.getWebsite());
					System.out.println("Registration No : " + ca.getRegistrationNo());
				}

			} catch (AccountDoesNotExistException e) {
				System.out.println(e.getMessage());
			}

		}

	}

	private static void depositFunds() {

		System.out.println("Enter Account Number");
		long accNo = sc.nextLong();

		System.out.println("Enter pin number");
		String pin = sc.next();
		sc.nextLine();

		System.out.println("Enter the amount to deposit");
		double amount = sc.nextDouble();

		try {
			AccountManager.deposit(accNo, pin, amount);
		} catch (AccountNotActiveException | AccountDoesNotExistException | InvalidPinNumberException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void withdrawFunds() {
		System.out.println("Enter Account Number");
		long accNo = sc.nextLong();

		System.out.println("Enter pin number");
		String pin = sc.next();
		sc.nextLine();

		System.out.println("Enter the amount to withdraw");
		double amount = sc.nextDouble();

		try {
			AccountManager.withdraw(accNo, pin, amount);
		} catch (InvalidPinNumberException | AccountDoesNotExistException | AccountNotActiveException
				| InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void closeExistingAccount() {
		System.out.println("Enter Account Number");
		long accNo = sc.nextLong();

		System.out.println("Enter pin number");
		String pin = sc.next();
		sc.nextLine();

		try {
			Boolean status = AccountManager.close(accNo, pin);
			System.out.println("Is Account closed : " + status);
		} catch (AccountDoesNotExistException | InvalidPinNumberException | AccountAlreadyClosedException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void openNewAccount() throws InvalidAccountTypeException {
		System.out.println("Enter the name of account holder");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter AccountType");
		String accType = sc.next();
		sc.nextLine();
		System.out.println("Enter pin Number");
		String pin = sc.nextLine();
		System.out.println("Choose privilege (1. PREMIUM, 2. GOLD, 3. SILVER(Default)");
		int choice = sc.nextInt();
		Privilege privilege;
		if (choice == 1)
			privilege = Privilege.PREMIUM;
		else if (choice == 2)
			privilege = Privilege.GOLD;
		else if (choice == 3)
			privilege = Privilege.SILVER;
		else
			privilege = Privilege.SILVER;

		LocalDate dob = null;
		String gender = "";
		String phoneNo = "";
		String registrationNo = "";
		String website = "";
		String companyName = "";
		String dateOfBirth = "";
		Date date = null;

		if (accType.equalsIgnoreCase("Savings")) {
			System.out.println("Enter the date of birth(dd-mm-yyyy)");
			dateOfBirth = sc.next();

			SimpleDateFormat sd = new SimpleDateFormat("dd-mm-yyyy");
			try {
				date = sd.parse(dateOfBirth);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Convert Date Object to LocalDate
			Instant instant = date.toInstant();
			ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
			dob = zone.toLocalDate();

			sc.nextLine();
			System.out.println("Enter gender");
			gender = sc.next();
			sc.nextLine();

			System.out.println("Enter your phone Number");
			phoneNo = sc.next();
			sc.nextLine();

		} else {
			System.out.println("Enter company name");
			companyName = sc.next();
			sc.nextLine();

			System.out.println("Enter website");
			website = sc.next();
			sc.nextLine();
			System.out.println("Enter Registration Number");
			registrationNo = sc.next();
			sc.nextLine();
		}

		long accNo = 0;

		if (accType.equalsIgnoreCase("Savings"))
			try {
				accNo = AccountManager.open(name, accType, pin, privilege, dob, gender, phoneNo, companyName, website,
						registrationNo);
			} catch (AccountAlreadyActiveException | AgeInvalidException | RegistrationNumberNullValueException
					| InvalidAccountTypeException e) {
				System.out.println(e.getMessage());
			}

		else if (accType.equalsIgnoreCase("Current"))
			try {
				accNo = AccountManager.open(name, accType, pin, privilege, dob, gender, phoneNo, companyName, website,
						registrationNo);
			} catch (AccountAlreadyActiveException | AgeInvalidException | RegistrationNumberNullValueException
					| InvalidAccountTypeException e) {
				System.out.println(e.getMessage());
			}

		else
			throw new InvalidAccountTypeException("Invalid Account Type");

		System.out.println("Account Successfully Created");
		System.out.println("Account Id: " + accNo);

	}

}
