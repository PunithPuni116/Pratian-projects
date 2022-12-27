package com.pratian.ormlabs.dao;

import java.util.List;

import com.pratian.ormlabs.entities.Trainer;

public interface TrainerDao {
	public long saveTrainer(Trainer trainer);
	
	public boolean updateTrainer(Trainer trainer);
	
	public Trainer getTrainer(long trainerId);
	
	public Trainer getTrainer(String emailId);
	
	public List<Trainer> getTrainers();
}
