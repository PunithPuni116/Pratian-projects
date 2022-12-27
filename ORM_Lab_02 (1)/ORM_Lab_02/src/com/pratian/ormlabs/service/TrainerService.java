package com.pratian.ormlabs.service;

import java.util.List;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.Exception.TrainerNotFoundException;
import com.sa.entities.Organization;
import com.sa.entities.Trainer;

public interface TrainerService {
	
	public boolean addTrainer(Trainer trainer) throws TrainerNotFoundException;
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainerByTrainerId(long trainerId) throws TrainerNotFoundException;
	
	public Trainer getTrainerByEmailId(String emailId) throws TrainerNotFoundException;
	
	public List<Trainer> getAllTrainers();
	
	public boolean addTrainerOrganization(Trainer trainer,Organization org) throws TrainerNotFoundException;
	
	public Organization getTrainerOrganization(long trainerId) throws OrganizationNOtFoundException;
	
	public List<Trainer> getAllTrainersOfOrganization(String name);
	
	
}
