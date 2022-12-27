package com.pratian.ormlabs.service.impl;

import java.util.List;

import com.pratian.ormlabs.Exception.TrainerNotFoundException;
import com.pratian.ormlabs.Exception.TrainingNotFoundException;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;
import com.sa.entities.Training;
import com.pratian.ormlabs.service.TrainerService;

public class TrainerServiceImpl implements TrainerService {
	private JpaTrainerDao trainerDao;
	
	public TrainerServiceImpl() {
		this.setTrainerDao(new JpaTrainerDao());
	}

	@Override
	public boolean addTrainer(Trainer trainer) {
		// Check if Trainer already exists
		Trainer trainerFromDao = trainerDao.getTrainer(trainer.getTrainerId());
		if(trainerFromDao == null) {
			trainerDao.saveTrainer(trainer);
			return true;
		}
		return false;
		
	}
	
	@Override
	public boolean addPersonalProfile(PersonalProfile profile) {
		PersonalProfile profileFromDb=trainerDao.getPersonalProfile(profile.getProfileId());
		if(profileFromDb==null) {
			trainerDao.savePersonalProfile(profile);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateTrainer(Trainer trainer) {
		//Trainer trainerFromDB = getTrainerByTrainerId(trainer.getTrainerId());
		return trainerDao.updateTrainer(trainer);
	}

	@Override
	public Trainer getTrainerByTrainerId(long trainerId) throws TrainerNotFoundException {
		Trainer trainer = null;
		trainer = trainerDao.getTrainer(trainerId);
		if(trainer==null)
			throw new TrainerNotFoundException("Trainer does not exist");
		return trainer;
	}

	@Override
	public Trainer getTrainerByEmailId(String emailId) {
		Trainer trainer = null;
		trainer = trainerDao.getTrainer(emailId);
		return trainer;
	}

	@Override
	public List<Trainer> getAllTrainers() {
		List<Trainer> trainers = null;
		trainers = trainerDao.getTrainers();
		return trainers;
	}

	public JpaTrainerDao getTrainerDao() {
		return trainerDao;
	}

	public void setTrainerDao(JpaTrainerDao trainerDao) {
		this.trainerDao = trainerDao;
	}

	@Override
	public boolean addTrainerOrganization(Trainer trainer, Organization org) {
		
		Trainer trainerFromDao = trainerDao.getTrainer(org.getId());
		if(trainerFromDao == null) {
			trainerDao.saveTrainerOrganization(trainer, org);
			return true;
		}
		return false;
	}

	@Override
	public Organization getTrainerOrganization(long trainerId) {
		
		
		Organization organizationFromDao=trainerDao.findTrainerOrganization(trainerId);
		return organizationFromDao;
	}

	@Override
	public List<Trainer> getAllTrainersOfOrganization(String name) {
		
		List<Trainer> trainer=trainerDao.findTrainersOfOrganization(name);
		return trainer;
		
	}

	@Override
	public boolean addTrainersPersonalPofile(Trainer trainer, PersonalProfile profile) {
		Trainer trainerFromDb=trainerDao.getTrainer(profile.getProfileId());
		if(trainerFromDb==null)
		{
			trainerDao.saveTrainersPersonalProfile(trainer, profile);
		}
		return true;
	}

	@Override
	public boolean editPersonalProfile(PersonalProfile profile) {
		
		return trainerDao.updatePersonalProfile(profile);
		
	}

	@Override
	public PersonalProfile getTrainersPersonalProfile(long trainerId) {
		
		
		return trainerDao.findTrainersPersonalProfile(trainerId);
	}
	
	@Override
	public boolean addTraining(Training training) {
		
		//calling trainerdao to save training
		trainerDao.saveTraining(training);
		return true;
		
	}

	@Override
	public boolean editTraining(Training training) throws TrainingNotFoundException {
		
		return trainerDao.updateTraining(training);
	}

	@Override
	public Training getTrainingById(long trainingId) {
		return trainerDao.findTrainingById(trainingId);
	}

	@Override
	public boolean addTrainerToTraining(Trainer trainer, List<Training> trainings) {
		
		
		Trainer trainerFromDb=trainerDao.getTrainer(trainer.getTrainerId());
		if(trainerFromDb!=null) {
			trainerDao.saveTrainerToTraining(trainer, trainings);
			return true;
		}
		return false;
	}

	@Override
	public Trainer getTrainerOfTraining(long trainingId) {
		
		return trainerDao.findTrainerOfTraining(trainingId);
	}

	@Override
	public List<Training> getTrainingsByClient(String clientName) {
		
		return trainerDao.findTrainings(clientName);
	}

	@Override
	public List<Training> getTrainingsByTrainerEmail(String emailId) {
		
		return trainerDao.getTrainings(emailId);
	}

	

	

	
}
