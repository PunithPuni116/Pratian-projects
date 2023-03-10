package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.entities.Trainer;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;

public class TestMain4 {

	public static void main(String[] args) {
		// Identify test data
		String emailId = "chandrashekhar123@pratian.com";
		// Create a Trainer to be searched
		Trainer trainer = new Trainer();
		trainer.setEmailId(emailId);
		// Create Trainer service
		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		// Search a Trainer by email id
		Trainer resultObj = service.getTrainerByEmailId(emailId);
		// Display trainer details 
		System.out.println("-----------------------------------------"); 
		System.out.println("Trainer Id : " + resultObj.getTrainerId()); 
		System.out.println("Full Name : " + resultObj.getFullName()); 
		System.out.println("Email Id : " + resultObj.getEmailId());
		System.out.println("Age : " + resultObj.getAge()); 
		System.out.println("Target :" + resultObj.getYearlyTarget()); 
		System.out.println("-----------------------------------------");
		}

}
