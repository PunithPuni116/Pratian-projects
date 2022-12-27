package com.pratian.ormlabs.dao;

import java.util.List;

import com.pratian.ormlabs.exception.TrainerDoesnotFound;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;

public interface TrainerDao {
	
	public long saveTrainer(Trainer trainer);
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainer(long trainerId);
	
	public Trainer getTrainer(String emailId);
	
	public List<Trainer> getTrainers();
	
	public long saveTrainerOrganization(Trainer trainer,Organization organization);
	
	public Organization findTrainerOrganization(long trainerId);
	
	public List<Trainer> findTrainersOfOrganization(String name);
	
	public long saveTrainersPersonalProfile(Trainer trainer , PersonalProfile profile) throws TrainerDoesnotFound;
	
	public boolean updatePersonalProfile(PersonalProfile profile);
	
	public PersonalProfile findTrainersPersonalProfile(long trainerId) throws TrainerDoesnotFound;	
	
	public PersonalProfile getPersonalProfile(long profileId);
	
	public long savePersonalProfile(PersonalProfile profile);
}
