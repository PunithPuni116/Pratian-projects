package com.pratian.ormlabs.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.exception.TrainerDoesnotFound;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;

public class TestMain_3 {
	
	public static void main(String[] args) {
		long mobileNo=12345;
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
		String message1 = "Saved successfully ";
		String message2 = "Something went wrong!!! \n Try Again";
		System.out.println(status ? message1 : message2);
		
		
		
		

	}

}
