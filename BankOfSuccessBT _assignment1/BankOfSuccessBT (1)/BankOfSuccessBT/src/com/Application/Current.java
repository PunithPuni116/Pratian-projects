package com.Application;

//Entity Class - Represent the domain. Store data and pass around
public class Current extends Account{
    //Data Members
    private String websiteURL;
    private String registrationNumber;
    private String companyName;

    //Getters and Setters
    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
