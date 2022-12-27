//toget organization when trainer id is given
package com.pratian.ormlabs.main;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Organization;

public class TestMain_09 {

	public static void main(String[] args) {
		long trainerId = 1;
		// Create Trainer service
		TrainerServiceImpl trainerService = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		trainerService.setTrainerDao(new JpaTrainerDao());
		// Search Organization and Trainer by respective id's
		Organization organization;
		try {
			organization = trainerService.getTrainerOrganization(trainerId);
			display(organization);
		} catch (OrganizationNOtFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

	private static void display(Organization organization) {
		// TODO Auto-generated method stub
		// Display trainer's organization details
				System.out.println("---------------------------------------");
				System.out.println("Organization Id : " + organization.getId());
				System.out.println("Name : " + organization.getName());
				System.out.println("Contact No : " + organization.getContactNo());
				System.out.println("Website : " + organization.getWebsite());
				System.out.println("---------------------------------------");
	}

}
