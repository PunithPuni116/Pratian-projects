//to add the trainer
package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Trainer;

public class TestMain_1 {

	public static void main(String[] args) {
		String fullName = "Venkat Shiva Reddy";
		String emailId = "venkat@pratian.com";
		float target = 20_00_000.0f;
		int age = 35;
		// Create a Trainer
		Trainer trainer = new Trainer(fullName, emailId, target, age);
		// Create Trainer service
		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		// Save Trainer
		boolean status = service.addTrainer(trainer);
		// Display storing trainer status
		String message1 = "Saved successfully ";
		String message2 = "Something went wrong!!! \n Try Again";
		System.out.println(status ? message1 : message2);

	}

}
