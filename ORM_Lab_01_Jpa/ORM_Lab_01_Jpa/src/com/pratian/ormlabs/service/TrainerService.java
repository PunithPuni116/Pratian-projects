package com.pratian.ormlabs.service;

import java.util.List;

import com.pratian.ormlabs.entities.Trainer;

public interface TrainerService {
	public boolean addTrainer(Trainer trainer);
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainerByTrainerId(long trainerId);
	
	public Trainer getTrainerByEmailId(String emailId);
	
	public List<Trainer> getAllTrainers();
	
}
