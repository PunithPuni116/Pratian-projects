package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.entities.Trainer;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;

public class TestMain2 {

	public static void main(String[] args) {
		// Identify test data to update the trainer l
		long trainerId = 1; 
		String fullName = "Chandra Shekhar H M";
		String emailId = "chandrashekhar123@pratian.com"; 
		float target = 15_00_000.0f; 
		int age = 26;
		// Create a Trainer to update the details
		Trainer trainer = new Trainer(fullName, emailId, target, age);
		trainer.setTrainerId(trainerId);
		// Create Trainer service
		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		// Update Trainer
		boolean status = service.updateTrainer(trainer);
		// Display update trainer status
		String message1 = "Updated successfully ";
		String message2 = "Something went wrong!!! \n Not updated";
		System.out.println(status ? message1 : message2);
		}
}
