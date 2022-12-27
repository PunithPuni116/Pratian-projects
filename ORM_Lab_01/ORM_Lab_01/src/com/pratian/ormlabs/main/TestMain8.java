package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.entities.Organization;
import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;


public class TestMain8 {
	public static void main(String[] args) {
		long organizationId = 2;
		// Create an Organization to be searched
		Organization organization = new Organization();
		
		// Create Organization service
		OrganizationServiceImpl service = new OrganizationServiceImpl();
		// Set dao implementation to be used by service
		service.setOrganizationDao(new JpaOrganizationDao());
		// Search Organization by organization id
		Organization resultObj = service.getOrganizationById(organizationId);
		// Display organization details searched based on organization id
		System.out.println("---------------------------------------------");
		System.out.println("Organization Id : " + resultObj.getOrganizationId());
		System.out.println("Name : " + resultObj.getName());
		System.out.println("Contact No : " + resultObj.getContactNo());
		System.out.println("Website : " + resultObj.getWebsite());
		System.out.println("---------------------------------------------");
	}
}
