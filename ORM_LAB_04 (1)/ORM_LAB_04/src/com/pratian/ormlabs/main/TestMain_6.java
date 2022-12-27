package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Training;

public class TestMain_6 {

	public static void main(String[] args) {
		long trainingId = 9;
		// Create Trainer service
		TrainerServiceImpl Service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		Service.setTrainerDao(new JpaTrainerDao());
		// Search Organization and Trainer by respective id's
		Training training =Service.getTrainingById(trainingId);
		// Display trainer's organization details
		System.out.println("---------------------------------------");
		System.out.println("Training Id : " + training.getTrainingId());
		System.out.println(" end date: " + training.getEndDate());
		System.out.println("Start date : " + training.getStartDate());
		System.out.println("clent name : " + training.getClientName());
		System.out.println("---------------------------------------");

	}

}
