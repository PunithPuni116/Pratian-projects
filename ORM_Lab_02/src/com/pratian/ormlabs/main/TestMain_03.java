//to add the organization
package com.pratian.ormlabs.main;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;




import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;

import com.sa.entities.Organization;

public class TestMain_03 {

	public static void main(String[] args) {
		long organizationId = 2;
		String name = "Pratian Technologies";
		String website = "http://www.pratian.com";
		long contactNo = 73382_12639L;
		// Create an Organization whose details need to be updated
		Organization organization = new Organization(name, website, contactNo);
		organization.setId(organizationId);
		// Create Organization service
		OrganizationServiceImpl service = new OrganizationServiceImpl();
		// Set dao implementation to be used by service
		service.setOrganizationDao(new JpaOrganizationDao());
		// Update Organization
		try {
			boolean status = service.updateOrganization(organization);
			String message1 = "Updated successfully ";
			String message2 = "Something went wrong!!! \n Try Again";
			System.out.println(status ? message1 : message2);
		}
		catch(OrganizationNOtFoundException e)
		{
			System.out.println(e.getMessage());
		}
		// Display updated organization status
		

	}
}
