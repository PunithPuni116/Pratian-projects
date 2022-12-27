//to add the personal profile to trainer
package com.pratian.ormlabs.main;

import java.time.LocalDate;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.exception.TrainerDoesnotFound;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;

public class TestMain_4 {

	public static void main(String[] args) {
		

		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		long trainerId=1;
		long mobileNo=12345;
		boolean relocate=true;
		
		LocalDate dOB=LocalDate.of(2001, 3, 14);
		
		// Create a Trainer
		PersonalProfile profile = new PersonalProfile(mobileNo, relocate, dOB);
		service.addPersonalProfile(profile);
		
		
		// Create Trainer service
		boolean status1;
		try {
			// Search a Trainer by trainer id
			
			Trainer resultObj = service.getTrainerByTrainerId(trainerId);
			status1 = service.addTrainersPersonalPofile(resultObj, profile);
			// Display storing trainer status
			String message11 = "Saved successfully ";
			String message21 = "Something went wrong!!! \n Try Again";
			System.out.println(status1 ? message11 : message21);
			
		} catch (TrainerDoesnotFound e) {
			// TODO Auto-generated catch block
	    System.out.println(e.getMessage());
		}
		
		
		// TODO Auto-generated method stub

	}

}
