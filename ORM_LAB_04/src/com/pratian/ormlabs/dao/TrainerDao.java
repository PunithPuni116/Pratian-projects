package com.pratian.ormlabs.dao;

import java.util.List;

import com.pratian.ormlabs.Exception.TrainingNotFoundException;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;
import com.sa.entities.Training;

public interface TrainerDao {
	
	public long saveTrainer(Trainer trainer);
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainer(long trainerId);
	
	public Trainer getTrainer(String emailId);
	
	public List<Trainer> getTrainers();
	
	public long saveTrainerOrganization(Trainer trainer,Organization organization);
	
	public Organization findTrainerOrganization(long trainerId);
	
	public List<Trainer> findTrainersOfOrganization(String name);
	
	public long saveTrainersPersonalProfile(Trainer trainer , PersonalProfile profile);
	
	public boolean updatePersonalProfile(PersonalProfile profile);
	
	public PersonalProfile findTrainersPersonalProfile(long trainerId);	
	
	public PersonalProfile getPersonalProfile(long profileId);
	
	public long savePersonalProfile(PersonalProfile profile);
	
	public long saveTraining(Training training);
	
	public boolean updateTraining(Training training) throws TrainingNotFoundException;
	
	public Training findTrainingById(long trainingId);
	
	public boolean saveTrainerToTraining(Trainer trainer, List<Training> trainings);
	
	public Trainer findTrainerOfTraining(long trainingId);
	
	public List<Training> findTrainings(String clientName);
	
	public List<Training> getTrainings(String trainerEmailId);
}
