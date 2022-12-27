package com.Application;

import java.time.LocalDate;
import javax.persistence.*;

@Entity  
@DiscriminatorValue("Savings")  
//Entity Class - Represent the domain. Store data and pass around
public class Savings extends Account {

    //Data Members
    private String gender;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    //Getters and Setters
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
