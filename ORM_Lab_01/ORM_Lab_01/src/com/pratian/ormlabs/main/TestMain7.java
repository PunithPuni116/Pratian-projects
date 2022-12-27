package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.entities.Organization;
import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;

public class TestMain7 {
	public static void main(String[] args) {
		long organizationId = 2;
		String name = "Pratian Technologies";
		String website = "http://www.pratian.com";
		long contactNo = 73382_12639L;
		// Create an Organization whose details need to be updated
		
		
		
		// Create Organization service
		OrganizationServiceImpl service = new OrganizationServiceImpl();
		
		// Set dao implementation to be used by service
		service.setOrganizationDao(new JpaOrganizationDao());
		
		Organization organization = service.getOrganizationById(organizationId);
		organization.setName(name);
		organization.setContactNo(contactNo);
		organization.setWebsite(website);
		// Update Organization
		boolean status = service.updateOrganization(organization);
		
		// Display updated organization status
		String message1 = "Updated successfully ";
		String message2 = "Something went wrong!!! \n Try Again";
		System.out.println(status ? message1 : message2);

	}
}
