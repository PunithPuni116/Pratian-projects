package com.pratian.ormlabs.main;

import java.util.ArrayList;
import java.util.List;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.service.impl.TrainerServiceImpl;
import com.sa.entities.Trainer;
import com.sa.entities.Training;

public class TestMain_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String trainierEmailId = "venkat@pratian.com";
		// Create Trainer service
		TrainerServiceImpl Service = new TrainerServiceImpl();
		// Set dao implementation to be used by service
		Service.setTrainerDao(new JpaTrainerDao());
		// Search Organization and Trainer by respective id's
		List<Training>trainings=new ArrayList<>();
		trainings =Service.getTrainingsByTrainerEmail(trainierEmailId);
		display(trainings);
		// Display trainer's organization details
		

	}

	private static void display(List<Training> trainings) {
		// TODO Auto-generated method stub
		for(Training i:trainings)
		{
			System.out.println("---------------------------------------");
			System.out.println("client name : " + i.getClientName());
			System.out.println("Training id : " + i.getTrainingId());
			System.out.println("end date : " + i.getEndDate());
			System.out.println("start date: " + i.getStartDate());
			System.out.println("---------------------------------------");
		}
	}

}
