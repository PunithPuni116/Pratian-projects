package com.pratian.ormlabs.service.impl;

import java.util.List;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.Exception.TrainerNotFoundException;
import com.pratian.ormlabs.dao.jpa.JpaTrainerDao;
import com.sa.entities.Organization;
import com.sa.entities.Trainer;
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
	public Trainer getTrainerByTrainerId(long trainerId) throws TrainerNotFoundException {
		Trainer trainer = null;
		trainer = trainerDao.getTrainer(trainerId);
		if(trainer==null)
			throw new TrainerNotFoundException("Trainer does not found");
		return trainer;
	}

	@Override
	public Trainer getTrainerByEmailId(String emailId) throws TrainerNotFoundException {
		Trainer trainer = null;
		trainer = trainerDao.getTrainer(emailId);
		if(trainer==null)
			throw new TrainerNotFoundException("Trainer does not found");
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
	public boolean addTrainerOrganization(Trainer trainer, Organization org) throws TrainerNotFoundException {
		
		Trainer trainerFromDao = trainerDao.getTrainer(org.getId());
		if(trainerFromDao == null) {
			trainerDao.saveTrainerOrganization(trainer, org);
		}
		
		return true;
	}

	@Override
	public Organization getTrainerOrganization(long trainerId) throws OrganizationNOtFoundException {
		
		
		Organization organizationFromDao=trainerDao.findTrainerOrganization(trainerId);
		return organizationFromDao;
	}

	@Override
	public List<Trainer> getAllTrainersOfOrganization(String name) {
		
		List<Trainer> trainer=trainerDao.findTrainersOfOrganization(name);
		return trainer;
		
	}

	
}
