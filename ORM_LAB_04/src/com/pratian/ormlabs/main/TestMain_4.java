//to add trainings to trainer
package com.pratian.ormlabs.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.pratian.ormlabs.Exception.TrainerNotFoundException;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Trainer;
import com.sa.entities.Training;

public class TestMain_4 {

	public static void main(String[] args) {
		
		Training training1=new Training();
		training1.setClientName("Roshan");
		training1.setEndDate(LocalDate.now());
		training1.setStartDate(LocalDate.now());
		
		
		Training training2=new Training();
		training2.setClientName("punith");
		training2.setEndDate(LocalDate.now());
		training2.setStartDate(LocalDate.now());
		
		List<Training>trainings=new ArrayList<>();
		trainings.add(training2);
		trainings.add(training1);
		
		TrainerServiceImpl service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		service.setTrainerDao(new JpaTrainerDao());
		// Save Trainer
		boolean status = service.addTraining(training1);
		boolean status2= service.addTraining(training2);
		// Display storing trainer status
		display(status2);
		
		
		//get trainer by id
		// Identify test data
		
		long trainerId = 0;
		// Search a Trainer by trainer id
		Trainer resultObj;
		try {
			resultObj = service.getTrainerByTrainerId(trainerId);
			boolean status1 = service.addTrainerToTraining(resultObj, trainings);
			display(status1);
		} catch (TrainerNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		// Create Trainer service
		
		
		// Display storing trainer status
		
		
		
	}

	private static void display(boolean status1) {
		// TODO Auto-generated method stub
		// Display storing trainer status
		String message11 = "Saved successfully ";
		String message21 = "Something went wrong!!! \n Try Again";
		System.out.println(status1 ? message11 : message21);
		
	}
	

}
