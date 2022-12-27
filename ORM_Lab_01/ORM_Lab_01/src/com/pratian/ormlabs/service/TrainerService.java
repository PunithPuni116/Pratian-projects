package com.pratian.ormlabs.service;

import java.util.List;

import com.pratian.ormlabs.entities.Organization;
import com.pratian.ormlabs.entities.Trainer;

public interface TrainerService {
	
	public boolean addTrainer(Trainer trainer);
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainerByTrainerId(long trainerId);
	
	public Trainer getTrainerByEmailId(String emailId);
	
	public List<Trainer> getAllTrainers();
	
	public boolean addTrainerOrganization(Trainer trainer,Organization org);
	
	public Organization getTrainerOrganization(long trainerId);
	
	public List<Trainer>getAllTrainersOfOrganization(String organizationName);
		
	
	
	}
	

