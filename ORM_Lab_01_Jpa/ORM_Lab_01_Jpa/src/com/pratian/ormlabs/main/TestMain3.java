package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.entities.Trainer;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;

public class TestMain3 {

	public static void main(String[] args) {
		// Identify test data
		long trainerId = 1;
		// Create a Trainer to be searched
		Trainer trainer = new Trainer();
		trainer.setTrainerId(trainerId);
		// Create Trainer service
		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		// Search a Trainer by trainer id
		Trainer resultObj = service.getTrainerByTrainerId(trainerId);
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
