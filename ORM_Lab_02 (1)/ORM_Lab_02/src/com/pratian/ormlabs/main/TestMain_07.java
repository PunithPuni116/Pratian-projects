//to get organization when name is given
package com.pratian.ormlabs.main;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;

import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;
import com.sa.entities.Organization;


public class TestMain_07 {

	public static void main(String[] args) {
		// Identify test data
		String organizationName = "Pratian Technologies";
		// Create a Organization to be searched
		Organization organization = new Organization();
		organization.setName(organizationName);
		// Create Organization service
		OrganizationServiceImpl service = new OrganizationServiceImpl();
		// Set dao implementation to be used by service
		service.setOrganizationDao(new JpaOrganizationDao());
		// Search Organization by organization name
		Organization resultObj;
		try {
			resultObj = service.getOrganizationByName(organizationName);
			display(resultObj);
		} catch (OrganizationNOtFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		// Display organization details searched based on organization name
		
		}

	private static void display(Organization resultObj) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------");
		System.out.println("Organization Id : " + resultObj.getId());
		System.out.println("Name : " + resultObj.getName());
		System.out.println("Contact No : " + resultObj.getContactNo());
		System.out.println("Website : " + resultObj.getWebsite());
		System.out.println("---------------------------------------------");
		
	}

}
