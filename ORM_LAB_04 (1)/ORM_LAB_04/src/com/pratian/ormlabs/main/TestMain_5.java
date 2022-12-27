package com.pratian.ormlabs.main;

import java.time.LocalDate;

import com.pratian.ormlabs.Exception.TrainingNotFoundException;
import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.OrganizationServiceImpl;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Training;

import net.bytebuddy.asm.Advice.Local;

public class TestMain_5 {

	public static void main(String[] args) {
		long trainingId = 8;
		LocalDate startDate=LocalDate.of(1999, 9, 30);
		LocalDate endDate=LocalDate.of(2001, 3, 19);
		String clientName="British Telecom";
		
		// Create an Organization whose details need to be updated

		Training training =new Training();
		training.setClientName(clientName);
		training.setEndDate(endDate);
		training.setStartDate(startDate);
		training.setTrainingId(trainingId);
		// Create Organization service
		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		// Update Organization
		boolean status;
		try {
			status = service.editTraining(training);
			display(status);
		} catch (TrainingNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

	private static void display(boolean status) {
		// TODO Auto-generated method stub
		String message1 = "Updated successfully ";
		String message2 = "Something went wrong!!! \n Try Again";
		System.out.println(status ? message1 : message2);
		
	}
}
