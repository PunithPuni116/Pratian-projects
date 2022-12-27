//todisplay the all the list of organizations
package com.pratian.ormlabs.main;

import java.util.List;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;
import com.sa.entities.Organization;


public class TestMain_08 {

	public static void main(String[] args) {
		OrganizationServiceImpl service = new OrganizationServiceImpl();
		// Set dao implementation to be used by service
		service.setOrganizationDao(new JpaOrganizationDao());
		// Get all organizations
		List<Organization> organizations;
		try {
			
			organizations = service.getAllOrganizations();
			display(organizations);
		} catch (OrganizationNOtFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Display all the organizations stored in the system
		
	}

	private static void display(List<Organization> organizations) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------");
		System.out.println("ORGANIZATION DETAILS ARE : ");
		for(Organization organization : organizations) {
		System.out.println("---------------------------------------------");
		System.out.println("Organization Id : " + organization.getId());
		System.out.println("Name : " + organization.getName());
		System.out.println("Contact No : " + organization.getContactNo());
		System.out.println("Website : " + organization.getWebsite());
		}
		System.out.println("---------------------------------------------");

		}
		
	}


