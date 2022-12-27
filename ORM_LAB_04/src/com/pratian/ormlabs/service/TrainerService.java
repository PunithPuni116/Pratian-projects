package com.pratian.ormlabs.service;

import java.util.List;

import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;
import com.pratian.ormlabs.Exception.TrainerNotFoundException;
import com.pratian.ormlabs.Exception.TrainingNotFoundException;
import com.sa.entities.*;

public interface TrainerService {
	
	public boolean addTrainer(Trainer trainer);
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainerByTrainerId(long trainerId) throws TrainerNotFoundException;
	
	public Trainer getTrainerByEmailId(String emailId);
	
	public List<Trainer> getAllTrainers();
	
	public boolean addTrainerOrganization(Trainer trainer,Organization org);
	
	public Organization getTrainerOrganization(long trainerId);
	
	public List<Trainer> getAllTrainersOfOrganization(String name);
	
	public boolean addTrainersPersonalPofile(Trainer trainer, PersonalProfile profile);
	
	public boolean editPersonalProfile(PersonalProfile profile);
	
	public PersonalProfile getTrainersPersonalProfile(long trainerId);
	
	public boolean addPersonalProfile(PersonalProfile profile);
	
	public boolean addTraining(Training training);
	
	public boolean editTraining(Training training) throws TrainingNotFoundException;
	
	public Training getTrainingById(long trainingId);
	
	public boolean addTrainerToTraining(Trainer trainer, List<Training> trainings);
	
	public Trainer getTrainerOfTraining(long trainingId);
	
	public List<Training> getTrainingsByClient(String clientName);
	
	public List<Training> getTrainingsByTrainerEmail(String emailId);
	
	
}
