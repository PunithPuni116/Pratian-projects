//to get all the trainers of organization
package com.pratian.ormlabs.main;

import java.util.List;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Organization;
import com.sa.entities.Trainer;

public class TestMain_05 {

	public static void main(String[] args) {
		String orgName = "Pratian Technologies";
		// Create a Organization to be searched
		Organization organization = new Organization();
		organization.setName(orgName);
		// Create Trainer service
		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		// Get trainers of an organization by organization name
		List<Trainer> trainers = service.getAllTrainersOfOrganization(orgName);
		// Display all trainer details of an organization
		System.out.println("---------------------------------------------");
		System.out.println("Organization Name : " + orgName) ;
		System.out.println("TRAINER's are : ");
		for(Trainer trainer : trainers) {
		System.out.println("--------------------------------------------");
		System.out.println("Trainer Id : " + trainer.getTrainerId());
		System.out.println("Full Name : " + trainer.getFullName());
		System.out.println("Email Id : " + trainer.getEmailId());
		System.out.println("Age : " + trainer.getAge());
		System.out.println("Target : " + trainer.getYearlyTarget());

		}

	}
}
	
