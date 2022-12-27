package com.pratian.ormlabs.main;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.Exception.TrainerNotFoundException;
import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Organization;
//to add the trainer to the organization
import com.sa.entities.Trainer;

public class TestMain_04 {

	public static void main(String[] args) {
		long organizationId = 2;
		long trainerId = 9;
		// Create a Organization and will be mapped to a trainer
		Organization organization = new Organization();
		organization.setId(organizationId);
//		Trainer trainer = new Trainer();
//		trainer.setTrainerId(trainerId);
		// Create Organization service
		OrganizationServiceImpl orgService = new OrganizationServiceImpl();
		// Create Trainer service
		TrainerServiceImpl trainerService = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		orgService.setOrganizationDao(new JpaOrganizationDao());
		trainerService.setTrainerDao(new JpaTrainerDao());
		// Search Organization and Trainer by respective id's
		Organization orgObj;
		try {
			orgObj = orgService.getOrganizationByid(organizationId);
			Trainer trainerObj = trainerService.getTrainerByTrainerId(trainerId);
			// Add trainer to organization
			trainerObj.setOrganization(orgObj);
			// Call trainer service to set organization to a trainer
			trainerService.addTrainerOrganization(trainerObj, orgObj);
			display(trainerObj);
			// Display trainer along with organization details
			
		} catch (OrganizationNOtFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch(TrainerNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void display(Trainer trainerObj) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------");

		System.out.println("Trainer Id : " + trainerObj.getTrainerId());
		System.out.println("Full Name : " + trainerObj.getFullName());
		System.out.println("Email : " + trainerObj.getEmailId());
		System.out.println("Yearly Target : " + trainerObj.getYearlyTarget());
		System.out.println("Age : " + trainerObj.getAge());
		System.out.println("Organization Id : " + trainerObj.getOrganization().getId());
		System.out.println("Name : " + trainerObj.getOrganization().getName());
		System.out.println("Contact No : " + trainerObj.getOrganization().getContactNo());
		System.out.println("Website : " + trainerObj.getOrganization().getWebsite());
		System.out.println("---------------------------------------------");
		
	}

}
