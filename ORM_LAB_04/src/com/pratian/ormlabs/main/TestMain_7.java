package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Trainer;
import com.sa.entities.Training;

public class TestMain_7 {
	public static void main(String[] args) {
		long trainingId = 8;
		// Create Trainer service
		TrainerServiceImpl Service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		Service.setTrainerDao(new JpaTrainerDao());
		// Search Organization and Trainer by respective id's
		Trainer trainer =Service.getTrainerOfTraining(trainingId);
		// Display trainer's organization details
		System.out.println("---------------------------------------");
		System.out.println("Profile Id : " + trainer.getTrainerId());
		System.out.println("Date of Birth : " + trainer.getAge());
		System.out.println("Contact No : " + trainer.getEmailId());
		System.out.println("Website : " + trainer.getFullName());
		System.out.println("Website : " + trainer.getYearlyTarget());
		System.out.println("---------------------------------------");

	}

}
