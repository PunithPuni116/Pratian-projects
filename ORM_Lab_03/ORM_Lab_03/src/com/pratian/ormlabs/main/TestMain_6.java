//to get trainer profile by trainer id
package com.pratian.ormlabs.main;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.exception.TrainerDoesnotFound;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;

public class TestMain_6 {

	public static void main(String[] args) {
		long trainerId = 10;
		// Create Trainer service
		TrainerServiceImpl trainerService = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		trainerService.setTrainerDao(new JpaTrainerDao());
		// Search Organization and Trainer by respective id's
		PersonalProfile profile;
		try {
			profile = trainerService.getTrainersPersonalProfile(trainerId);
			display(profile);
		} catch (TrainerDoesnotFound e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

	private static void display(PersonalProfile profile) {
		// TODO Auto-generated method stub
		// Display trainer's organization details
				System.out.println("---------------------------------------");
				System.out.println("Profile Id : " + profile.getProfileId());
				System.out.println("Date of Birth : " + profile.getDateOfBirth());
				System.out.println("Contact No : " + profile.getMobileNo());
				System.out.println("Website : " + profile.isRelocate());
				System.out.println("---------------------------------------");
		
	}

}
