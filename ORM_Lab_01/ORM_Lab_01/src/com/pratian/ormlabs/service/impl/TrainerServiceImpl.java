package com.pratian.ormlabs.service.impl;

import java.util.List;

import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.pratian.ormlabs.entities.Organization;
import com.pratian.ormlabs.entities.Trainer;
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
		}
		
		return true;
	}

	@Override
	public boolean updateTrainer(Trainer trainer) {
		//Trainer trainerFromDB = getTrainerByTrainerId(trainer.getTrainerId());
		return trainerDao.updateTrainer(trainer);
	}

	@Override
	public Trainer getTrainerByTrainerId(long trainerId) {
		Trainer trainer = null;
		trainer = trainerDao.getTrainer(trainerId);
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


	@Override
	public boolean addTrainerOrganization(Trainer trainer, Organization org) {
		// TODO Auto-generated method stub
		trainer.setOrganization(org);
		trainerDao.updateTrainer(trainer);
		
		return true;
	}

	@Override
	public Organization getTrainerOrganization(long trainerId) {
		// TODO Auto-generated method stub
		Trainer trainer=trainerDao.getTrainer(trainerId);
		
		return trainer.getOrganization();
	}

	@Override
	public List<Trainer> getAllTrainersOfOrganization(String organizationName) {
		// TODO Auto-generated method stub
		List<Trainer>trainers=trainerDao.getTrainers();
		return trainers;
		
		
	}
	
	public JpaTrainerDao getTrainerDao() {
		return trainerDao;
	}

	public void setTrainerDao(JpaTrainerDao trainerDao) {
		this.trainerDao = trainerDao;
	}

	
}
