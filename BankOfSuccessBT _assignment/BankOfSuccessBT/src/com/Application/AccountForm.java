package com.Application;

import java.util.Scanner;

//Boundary Class - this class has implementation which is interacting with the user
public class AccountForm {

    public void loadForm(){
        //This is the first method that is going to be called when the application
        //starts

        System.out.println("Hello. Welcome to Pratian Bank Pvt Ltd.,");
        System.out.println("How can I help you ?");

        System.out.println("1. Open an Account");
        System.out.println("2. Close an Account");
        System.out.println("3. Withdraw from an Account");
        System.out.println("4. Deposit into an Account");
        System.out.println("5. Transfer funds to an Account");

        String choice = new Scanner(System.in).nextLine();

        if(choice == "1"){
            open();
        }
        else if(choice == "2"){
            close();
        }
        else if(choice == "3"){
            withdraw();
        }
        else if(choice == "4"){
            deposit();
        }
        else if(choice == "5"){
            transfer();
        }

    }

    protected void open(){

        //Declaration and Initialization
        var scanner = new Scanner(System.in);

        //1. Get the type of account user wants to open
        System.out.println("Which account do you want to open?");
        System.out.println("Savings");
        System.out.println("Current");
        String accType = scanner.nextLine();

        //2. Get data from the user - Savings or Current
        if(accType == "Savings"){

            //Get savings account information from the user
            var savings = getSavingsAccountInformation();

            //Validate the boundary rules here
            if(validateSavingsAccountInfo(savings)){

                //3. Open the account according to the account type given
                //Call the manager to open the account
                boolean isOpened = openAccount(savings, accType);

                //4. Communicate the status back to the user
                //Display the account opening status
                displayAccountOpenStatus(isOpened);
            }

        }
        else if(accType == "2"){

            //Get current account information from the user
            var current = getCurrentAccountInformation();

            //Validate the boundary rules here
            if(validateCurrentAccountInfo(current)){


                //3. Open the account according to the account type given
                //Call the manager to open the account
                boolean isOpened = openAccount(current, accType);

                //4. Communicate the status back to the user
                //Display the account opening status
                displayAccountOpenStatus(isOpened);
            }
        }
    }

    protected Current getCurrentAccountInformation(){

        //Declaration and Initialization
        var scanner = new Scanner(System.in);

        //Store data into the object
        System.out.println("Enter Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter Company Name : ");
        String companyName = scanner.nextLine();

        System.out.println("Enter Website URL : ");
        String websiteURL = scanner.nextLine();

        System.out.println("Enter Registration Number : ");
        String registrationNumber = scanner.nextLine();

        System.out.println("Enter Pin Number : ");
        int pinNumber = scanner.nextInt();

        //Create the object and store data
        var current = new Current();
        current.setAccountName(name);
        current.setCompanyName(companyName);
        current.setRegistrationNumber(registrationNumber);
        current.setWebsiteURL(websiteURL);
        current.setPinNumber(pinNumber);

        //Returning the current object created
        return current;
    }

    protected Savings getSavingsAccountInformation(){

        //Declaration and Initialization
        var scanner = new Scanner(System.in);

        //Store data into the object
        System.out.println("Enter Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter Gender : ");
        String gender = scanner.nextLine();

        System.out.println("Enter Phone Number : ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Pin Number : ");
        int pinNumber = scanner.nextInt();

        //Create the object and store data
        var savings = new Savings();
        savings.setAccountName(name);
        savings.setGender(gender);
        savings.setPhoneNumber(phoneNumber);
        savings.setPinNumber(pinNumber);

        //Returning the savings object created
        return savings;
    }

    protected boolean validateSavingsAccountInfo(Savings savings){

        //Declaration
        boolean isValid = false;

        //Logic
        //Mandatory fields are entered

        //If everything is fine then
        isValid = true;

        //Return the status
        return isValid;
    }

    protected boolean validateCurrentAccountInfo(Current current){

        //Declaration
        boolean isValid = false;

        //Logic
        //Registration Number shouldn't be null
        //Company Name shouldn't be null

        //If everything is fine then
        isValid = true;

        //Return the status
        return isValid;
    }

    protected void displayAccountOpenStatus(boolean isOpened){

        if(isOpened){
            System.out.println("Account Opened Successfully !!!");
        }
        else
            System.out.println("Sorry !!! Couldn't open account");
    }

    protected boolean openAccount(Account account, String accType){

        //Declaration
        boolean isOpened = false;

        //Logic
        //Execute the logic of Opening the account;
        var accountManager = new AccountManager(accType);
        try {
            isOpened = accountManager.open(account, accType);


        } catch (InvalidAgeForOpeningAnAccountException e) {
            e.printStackTrace();
        }

        //Return the status
        return isOpened;
    }

    protected void close(){
        //Write code here---------------------
    }

    protected void withdraw(){
        //Write code here---------------------
    }

    protected void deposit(){
        //Write code here---------------------
    }

    protected void transfer(){
        //Write code here---------------------
    }
}
