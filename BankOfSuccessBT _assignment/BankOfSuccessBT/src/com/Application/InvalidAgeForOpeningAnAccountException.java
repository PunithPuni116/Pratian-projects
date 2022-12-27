package com.Application;

public class InvalidAgeForOpeningAnAccountException extends Exception {

    public InvalidAgeForOpeningAnAccountException(){

    }

    public InvalidAgeForOpeningAnAccountException(String message){
        super(message);
    }

}
