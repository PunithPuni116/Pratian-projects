
//get organization when Id is given
package com.pratian.ormlabs.main;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;
import com.sa.entities.Organization;

public class TestMain_06 {

	public static void main(String[] args) {
		long organizationId = 2;
		// Create an Organization to be searched
		Organization organization = new Organization();
		organization.setId(organizationId);
		// Create Organization service
		OrganizationServiceImpl service = new OrganizationServiceImpl();
		// Set dao implementation to be used by service
		service.setOrganizationDao(new JpaOrganizationDao());
		// Search Organization by organization id
		Organization resultObj;
		try {
			resultObj = service.getOrganizationByid(organizationId);
			display(resultObj);
			
		} catch (OrganizationNOtFoundException e) {
			
			System.out.println(e.getMessage());
		}
		// Display organization details searched based on organization id
		
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
