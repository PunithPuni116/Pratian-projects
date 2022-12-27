
//to add the profile id
package com.pratian.ormlabs.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import com.pratian.ormlabs.Exception.TrainerNotFoundException;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;

public class TestMain_3 {
	
	public static void main(String[] args) {
		long mobileNo=12345345;
		boolean relocate=true;
		
		LocalDate dOB=LocalDate.of(2001, 3, 14);
		
		// Create a Trainer
		PersonalProfile profile = new PersonalProfile(mobileNo, relocate, dOB);
		
		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		// Save Trainer
		boolean status = service.addPersonalProfile(profile);
		// Display storing trainer status
		display(status);
		
		
		//get trainer by id
		// Identify test data
		
		long trainerId = 1;
		// Search a Trainer by trainer id
		Trainer resultObj = null;
		try {
			resultObj = service.getTrainerByTrainerId(trainerId);
			boolean status1 = service.addTrainersPersonalPofile(resultObj, profile);
			display(status1);
		} catch (TrainerNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

	private static void display(boolean status1) {
		// TODO Auto-generated method stub
		String message11 = "Saved successfully ";
		String message21 = "Something went wrong!!! \n Try Again";
		System.out.println(status1 ? message11 : message21);
	}
	

}
