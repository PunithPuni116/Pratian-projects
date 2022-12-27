//to update the profile 
package com.pratian.ormlabs.main;

import java.time.LocalDate;

import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;

import net.bytebuddy.asm.Advice.Local;

public class TestMain_5 {

	public static void main(String[] args) {
		long profileId = 3;
		LocalDate dOB=LocalDate.of(1999, 9, 30);
		long mobileNo=98765;
		boolean relocate=false;
		
		// Create an profile whose details need to be updated
		PersonalProfile profile = new PersonalProfile(mobileNo, relocate, dOB);
		profile.setProfileId(profileId);
		
		// Create trainer service
		TrainerServiceImpl service = new TrainerServiceImpl();
		
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		
		// Update profile
		boolean status = service.editPersonalProfile(profile);
		
		// Display updated organization status
		String message1 = "Updated successfully ";
		String message2 = "Something went wrong!!! \n Try Again";
		System.out.println(status ? message1 : message2);

	}
}
