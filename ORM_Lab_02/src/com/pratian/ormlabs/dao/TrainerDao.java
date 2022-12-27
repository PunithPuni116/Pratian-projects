package com.pratian.ormlabs.dao;

import java.util.List;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.Exception.TrainerNotFoundException;
import com.sa.entities.Organization;
import com.sa.entities.Trainer;

public interface TrainerDao {
	
	public long saveTrainer(Trainer trainer);
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainer(long trainerId) ;
	
	public Trainer getTrainer(String emailId) throws TrainerNotFoundException;
	
	public List<Trainer> getTrainers();
	
	public long saveTrainerOrganization(Trainer trainer,Organization organization) throws TrainerNotFoundException;
	
	public Organization findTrainerOrganization(long trainerId) throws OrganizationNOtFoundException;
	
	public List<Trainer> findTrainersOfOrganization(String name);
	
}
