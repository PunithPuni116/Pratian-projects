package com.pratian.ormlabs.service;

import java.util.List;

import com.pratian.ormlabs.exception.TrainerDoesnotFound;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;

public interface TrainerService {
	
	public boolean addTrainer(Trainer trainer) throws TrainerDoesnotFound;
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainerByTrainerId(long trainerId) throws TrainerDoesnotFound;
	
	public Trainer getTrainerByEmailId(String emailId) throws TrainerDoesnotFound;
	
	public List<Trainer> getAllTrainers();
	
	public boolean addTrainerOrganization(Trainer trainer,Organization org) throws TrainerDoesnotFound;
	
	public Organization getTrainerOrganization(long trainerId);
	
	
	public List<Trainer> getAllTrainersOfOrganization(String name);
	
	
	public boolean addTrainersPersonalPofile(Trainer trainer, PersonalProfile profile) throws TrainerDoesnotFound;
	
	public boolean editPersonalProfile(PersonalProfile profile);
	
	public PersonalProfile getTrainersPersonalProfile(long trainerId) throws TrainerDoesnotFound;
	
	public boolean addPersonalProfile(PersonalProfile profile);
	
	
	
}
