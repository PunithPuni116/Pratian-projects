package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.entities.Organization;
import com.pratian.ormlabs.entities.Trainer;
import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;

public class TestMain6 {
	public static void main(String[] args) {
		
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
		 service.addOrganization(organization);
		// Display stored organization status
		

	}

}
