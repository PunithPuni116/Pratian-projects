package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;

import com.sa.entities.Organization;

import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;

     public class TestMain_2 {
    	 public static void main(String[] args) {
    		// Identify test data
    			String name = "Pratian";
    			String website = "https://www.pratian.com";
    			long contactNo = 1234567890L;
    			// Create an Organization
    			Organization organization = new Organization(name, website, contactNo);
    		
    			// Create Organization service
    			OrganizationServiceImpl service = new OrganizationServiceImpl();
    			// Set dao implementation to be used by service
    			service.setOrganizationDao(new JpaOrganizationDao());
    			// Save Organization to the System
    			boolean status = service.addOrganization(organization);
    			// Display stored organization status
    			String message1 = "Saved successfully ";
    			String message2 = "Something went wrong!!! \n Try Again";
    			System.out.println(status ? message1 : message2);
    			
    	 }
	
}
