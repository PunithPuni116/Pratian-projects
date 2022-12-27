package com.Application;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.bank.database.HibernateUtil;
import com.bank.database.HibernateUtil;
import com.bank.exceptions.AccountAlreadyClosedException;
import com.bank.exceptions.InsufficientBalanceException;
import com.bank.exceptions.InvalidAgeForOpeningAnAccountException;
import com.bank.exceptions.InvalidInputException;
import com.bank.exceptions.InvalidPinNumberException;

//Boundary Class - this class has implementation which is interacting with the user
public class AccountForm {

    public void loadForm() throws InvalidInputException, InvalidPinNumberException{
        //This is the first method that is going to be called when the application
        //starts
    	while(true) {
	        System.out.println("Hello. Welcome to Pratian Bank Pvt Ltd.,");
	        System.out.println("How can I help you ?\n--------------");
	
	        System.out.println("1. Open an Account");
	        System.out.println("2. Close an Account");
	        System.out.println("3. Withdraw from an Account");
	        System.out.println("4. Deposit into an Account");
	        System.out.println("5. Transfer funds to an Account\n-----------");
	        int choice=new Scanner(System.in).nextInt();
	        
	        switch(choice) {
		        case 1: open();
		        		break;
		        		
		        case 2: close();
		        		break;
		        		
		        case 3: withdraw();
		        		break;
		        		
		        case 4: deposit();
		        		break;
		        default:
		        	System.out.println("Enter valid input");
		        		  
	        }
    	}
        
    

    }

    public void open() throws InvalidInputException {

        //Declaration and Initialization
        Scanner scanner = new Scanner(System.in);

        //1. Get the type of account user wants to open
        System.out.println("Which account do you want to open?");
        System.out.println("Savings");
        System.out.println("Current");
       
        String accType = scanner.next();

        //2. Get data from the user - Savings or Current
        if(accType.equalsIgnoreCase("Savings")){

            //Get savings account information from the user
            Savings savings = getSavingsAccountInformation();

//
                //3. Open the account according to the account type given
                //Call the manager to open the account
                boolean isOpened = openAccount(savings, accType);
//
//                //4. Communicate the status back to the user
//                //Display the account opening status
                displayAccountOpenStatus(isOpened,savings);
                
                HibernateUtil save=new HibernateUtil();
               save.saveAccountData(savings);
//            }

        }
        else if(accType.equalsIgnoreCase(accType)){

            //Get current account information from the user
            Current current = getCurrentAccountInformation();

                //3. Open the account according to the account type given
                //Call the manager to open the account
                boolean isOpened = openAccount(current, accType);

                //4. Communicate the status back to the user
                //Display the account opening status
                displayAccountOpenStatus(isOpened,current);
                HibernateUtil save=new HibernateUtil();
                save.saveAccountData(current);
            }
        }
    

    protected Current getCurrentAccountInformation(){

        //Declaration and Initialization
        Scanner scanner = new Scanner(System.in);

        //Store data into the object
        String name;
        while(true) {
        	try {
	        	System.out.println("Enter Name : ");
	        	name = scanner.nextLine();
	        //to check if name has any digits
	        	boolean hasDigit = name.matches(".*\\d+.*");
	        
	        	if(hasDigit) {
	        		throw new InvalidInputException("Error : Name should not contains digits. Enter name again");
	        	}
	        	break;
        	}
        	catch(InvalidInputException e) {
        		System.out.println(e.getMessage());
        		continue;
        	}
	        		
        }
        Privilege privilege=getPrivilegeFromUser();

        System.out.println("Enter Company Name : ");
        String companyName = scanner.next();

        System.out.println("Enter Website URL : ");
        String websiteURL = scanner.next();
        
        String registrationNumber;
        while(true) {
        	try {
		        System.out.println("Enter Registration Number : ");
		        registrationNumber = scanner.next();
		        if(registrationNumber==null || registrationNumber=="") {
		        	throw new InvalidInputException("Error : Registration number should not be null. Enter number again");
		        }
		        break;
        	}
        	catch(InvalidInputException e) {
        		System.out.println(e);
        		continue;
        	}
    }

        int pinNumber;
        while(true) {
        	System.out.println("Enter Pin Number : ");
        
        	try {
        		pinNumber=scanner.nextInt();
        	}
        	catch(NumberFormatException e) {
        		System.out.println("Error : pin should not contain any characters ");
        		continue;
        	}
        	break;
       }

        //Create the object and store data
        var current = new Current();
        current.setAccountNumber();
        current.setAccountName(name);
        current.setCompanyName(companyName);
        current.setRegistrationNumber(registrationNumber);
        current.setWebsiteURL(websiteURL);
        current.setPinNumber(pinNumber);
        current.setPrivilege(privilege);

        //Returning the current object created
        return current;
    }
    protected Privilege getPrivilegeFromUser() {
    	System.out.println("Select 1.PREMIUM 2.GOLD 3.SILVER");
    	int choice=new Scanner(System.in).nextInt();
    	Privilege privilege = null;
    	
	    	while(true) {
		    	if(choice==1)
		    		privilege=privilege.PREMIUM;
		    	else if(choice==2)
		    		privilege=Privilege.GOLD;
		    	else if(choice==3)
		    		privilege=Privilege.SILVER;
		    	else {
		    		System.out.println("Error : Enter valid option");
		    		continue;
		    	}
		    	break;
	    	}
    	
    	return privilege;
    }

    protected Savings getSavingsAccountInformation() throws InvalidInputException {

        //Declaration and Initialization
        Scanner scanner = new Scanner(System.in);

        //Store data into the object
        String name;
        while(true) {
        	try {
	        	System.out.println("Enter Name : ");
	        	name = scanner.next();
	        //to check if name has any digits
	        	boolean hasDigit = name.matches(".*\\d+.*");
	        
	        	if(hasDigit) {
	        		throw new InvalidInputException("Error : Name should not contains digits. Enter name again");
	        	}
	        	break;
        	}
        	catch(InvalidInputException e) {
        		System.out.println(e.getMessage());
        		continue;
        	}
	        		
        }
        // getting gender input from user
        String gender;
        while(true) {
        	try {
        		System.out.println("Enter Gender Male or Female: ");
        		gender = scanner.next();
        		//to check if it is entered correctly
        		if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("female")) {
        				break;
        		}
        		else {
        			throw new InvalidInputException("Error: Invalid gender input. Please enter valid input again");
        		}
        	}
        	catch(InvalidInputException e) {
        		System.out.println(e.getMessage());
        		continue;
        	}
        	
        }
        //to get phone number
        String phoneNumber;
        while(true) {
        	try {
	        	System.out.println("Enter Phone Number : ");
	            phoneNumber = scanner.next();
	            if(phoneNumber.length()<10 || phoneNumber.length()>10){
	            	throw new InvalidInputException("Error : Mobile number should be 10 digits. Enter valid phone number.");
	            }
	            break;
        	}
        	catch(InvalidInputException e) {
        		System.out.println(e.getMessage());
        		continue;
        	}
           
        }
        
        Privilege privilege=getPrivilegeFromUser();
        //to get pin number
        int pinNumber;
        while(true) {
        	System.out.println("Enter Pin Number : ");
        
        	try {
        		pinNumber=scanner.nextInt();
        		
        	}
        	catch(NumberFormatException e) {
        		System.out.println("Error : pin should not contain any characters ");
        		continue;
        	}
        	break;
       }
        LocalDate dateOfBirth;
        while(true) {
        	System.out.println("Enter birthdate in yyyy-mm-dd format :");
        	try {
        		String dateOfBirthString=scanner.next();
        		dateOfBirth = LocalDate.parse(dateOfBirthString);  
        	}
        	catch(Exception e){
        		System.out.println("Error: enter the date in yyyy-mm-dd format");
        		continue;
        	}
        	break;
        }

        //Create the object and store data
        Savings savings = new Savings();
        savings.setAccountNumber();
        savings.setAccountName(name);
        savings.setGender(gender);
        savings.setPhoneNumber(phoneNumber);
        savings.setPinNumber(pinNumber);
        savings.setDateOfBirth(dateOfBirth);
        savings.setPrivilege(privilege);
        //Returning the savings object created
 
        return savings;
    }


   

    protected boolean openAccount(Account account, String accType){

        //Declaration
        boolean isOpened = false;

        //Logic
        //Execute the logic of Opening the account;
        AccountManager accountManager = new AccountManager();
        try {
            isOpened = accountManager.open(account, accType);
        } catch (InvalidAgeForOpeningAnAccountException e) {
            e.printStackTrace();
        }

        //Return the status
        return isOpened;
    }
    protected void getAccountInformation() {
    	HibernateUtil hibernateUtil=new HibernateUtil();
    	Account account;
    	int accountNumber;
    	try {
    		System.out.println("Enter accountNumber : ");
    		accountNumber= new Scanner(System.in).nextInt();
    		AccountManager accManager=new AccountManager();
    		boolean checkPinNumber=accManager.pinNumberValidate(accountNumber);
	    	if(checkPinNumber) {
	    		 account=hibernateUtil.getAccountData(accountNumber);
			    	if(account instanceof Savings) {
			    		Savings savings=(Savings)account;
			    		System.out.println("Account Number: "+savings.getAccountNumber());
			    		System.out.println("Account Holder's name : "+savings.getAccountName());
			    		System.out.println("Account Balance : "+savings.getBalance());
			    		System.out.println("Phone Number : "+savings.getPhoneNumber());
			    		System.out.println("Date of Birth : "+savings.getDateOfBirth());
			    		System.out.println("Account Activated On : "+savings.getActivatedDate());
			    	}
			    	else {
			    		Current current=(Current)account;
			    		System.out.println("Account Number: "+current.getAccountNumber());
			    		System.out.println("Account Holder's name : "+current.getAccountName());
			    		System.out.println("Account Balance : "+current.getBalance());
			    		System.out.println("Company name : "+current.getCompanyName());
			    		System.out.println("Registration Number: "+current.getRegistrationNumber());
			    		System.out.println("Company website : "+current.getWebsiteURL());
			    		System.out.println("Account activated on: "+current.getActivatedDate());
			    	}
		    	}
    	}
    	
    	catch(InvalidPinNumberException e) {
    		System.out.println(e.getMessage());
    	}
    	
 
    	
    	
    }
    
//    protected boolean pinNumberValidate(int accountNumber) throws InvalidPinNumberException {
//    	
//    	Scanner input=new Scanner(System.in);
//    	int pinNumber;
//    	try {
//    		
//    		System.out.println("Enter the pin number :");
//    		pinNumber=input.nextInt();
//	    	HibernateUtil hibernate=new HibernateUtil();
//	    	Account account=hibernate.getAccountData(accountNumber);
//	    	
//	    	if(account.getPinNumber()!=pinNumber)
//	    		throw new InvalidPinNumberException("Pin number is wrong ");
//	    	return true;
//    	}
//    	catch(InputMismatchException e) {
//    		System.out.println("Error : Enter valid Account or pin number");
//    	}
//    	catch(InvalidPinNumberException e) {
//    		System.out.println(e.getMessage());
//    	}
//    	return false;
//    	
//    }

    protected void close(){
    	int accountNumber;
    	Scanner input=new Scanner(System.in);
    	HibernateUtil hbUtil=new HibernateUtil();
    	try {
    		System.out.println("Enter account number :");
    		accountNumber=input.nextInt();
    		AccountManager accountManager=new AccountManager();
    		accountManager.pinNumberValidate(accountNumber);
    		Account account=hbUtil.getAccountData(accountNumber);
    		if(account.isActive()) {
    			account.setActive(false);
    			System.out.println("Account closed sucessfully !!!!");
    			hbUtil.UpdateAccountData(account);
    		}
    		else {
    			throw new AccountAlreadyClosedException("Account already closed");
    		}
    	}
    	catch(InputMismatchException e) {
    		System.out.println("Error : Enter valid account number ");
    	}
    	catch(InvalidPinNumberException e) {
    		System.out.println(e.getMessage());
    	}
    	catch(AccountAlreadyClosedException e) {
    		System.out.println(e.getMessage());
    	}
    	
    }

    protected void withdraw(){
    	int accountNumber;
    	double amount;
    	Scanner input=new Scanner(System.in);
    	HibernateUtil hbUtil=new HibernateUtil();
    	try {
    		System.out.println("Enter account number :");
    		accountNumber=input.nextInt();
    		System.out.println("Enter the amount to be withdrawn :");
    		amount=input.nextDouble();
    		AccountManager accountManager=new AccountManager();
    		accountManager.pinNumberValidate(accountNumber);
    		Account account=hbUtil.getAccountData(accountNumber);
    		if(account.getBalance()<amount) {
    			throw new InsufficientBalanceException("Insufficient balance. Withdraw cannot be processed");
    		}
    		else {
    			double remainingAmount=account.getBalance()-amount;
    			account.setBalance(remainingAmount);
    			hbUtil.UpdateAccountData(account);
    			System.out.println("Your account Number "+account.getAccountName()+" is debited of Rs."+amount+" on "+LocalDate.now());
    			System.out.println("Available balance is "+account.getBalance());
    		}
    		
    	}
    	catch(InputMismatchException e) {
    		System.out.println("Error : Enter valid account number or amount");
    	}
    	catch(InvalidPinNumberException e) {
    		System.out.println(e.getMessage());
    	}
    	catch(InsufficientBalanceException e) {
    		System.out.println(e.getMessage());
    	}
    }

    protected void deposit(){
    	int accountNumber;
    	double amount;
    	Scanner input=new Scanner(System.in);
    	HibernateUtil hbUtil=new HibernateUtil();
    	try {
    		System.out.println("Enter account number :");
    		accountNumber=input.nextInt();
    		System.out.println("Enter the amount to be deposit :");
    		amount=input.nextDouble();
    		AccountManager accountManager=new AccountManager();
    		boolean checkPinNumber=accountManager.pinNumberValidate(accountNumber);
    		boolean isActive=accountManager.checkAccountisActive(accountNumber);
    		if(!checkPinNumber) {
    	    	throw new InvalidPinNumberException("Wrong pin Number");
    	    }
    		else if(!isActive) {
    	    	throw new AccountAlreadyClosedException("Account is closed. Deposit cannot be processed ");
    	    }
    	    
    		
    		Account account=hbUtil.getAccountData(accountNumber);
  
    		double remainingAmount=account.getBalance()+amount;
    		account.setBalance(remainingAmount);
    		hbUtil.UpdateAccountData(account);
    		System.out.println("Your account Number "+account.getAccountNumber()+" is deposited of Rs."+amount+" on "+LocalDate.now());
    		System.out.println("Available balance is "+account.getBalance());
    		
    		
    	}
    	catch(InputMismatchException e) {
    		System.out.println("Error : Enter valid account number or amount");
    	}
    	catch(InvalidPinNumberException e) {
    		System.out.println(e.getMessage());
    	} 
    	catch (AccountAlreadyClosedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
    	
    }
    
    protected void displayAccountOpenStatus(boolean isOpened,Account account){

        if(isOpened){
            System.out.println("Account Opened Successfully !!!");
            System.out.println("Account Number : "+account.getAccountNumber());
            System.out.println("Account holder's name : "+account.getAccountName());
            System.out.println("Balance :"+account.getBalance());
        }
        else
            System.out.println("Sorry !!! Couldn't open account");
    }
   

   
    
}
