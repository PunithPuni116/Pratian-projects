package com.pratian.ormlabs.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.pratian.ormlabs.dao.TrainerDao;
import com.pratian.ormlabs.dao.util.JpaUtil;
import com.pratian.ormlabs.entities.Trainer;

public class JpaTrainerDao implements TrainerDao {

	@Override
	public long saveTrainer(Trainer trainer) {
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		
		// Begin Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		// Save / Persist User
		em.persist(trainer);//inserting data into table DB
		
		// Commit Transaction
		et.commit();
		
		// Close the Manager
		em.close();
		
		return trainer.getTrainerId();
	
	}

	@Override
	public boolean updateTrainer(Trainer trainer) { //updated data
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		
		// Begin Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		// Save / Persist User
		Trainer existingTrainer = em.find(Trainer.class, trainer.getTrainerId()); //id =2
		existingTrainer.setFullName(trainer.getFullName());
		existingTrainer.setEmailId(trainer.getEmailId());
		existingTrainer.setYearlyTarget(trainer.getYearlyTarget());
		existingTrainer.setAge(trainer.getAge());
		
		// Commit Transaction
		et.commit();
		
		// Close the Manager
		em.close();
		
		return true;
	}

	@Override
	public Trainer getTrainer(long trainerId) {
		Trainer trainer = null;
		
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		
		// Get user by user_id
		trainer = em.find(Trainer.class, trainerId);

		// Close the manager
		em.close();
		
		return trainer;
		
	}

	@Override
	public Trainer getTrainer(String emailId) {
		Trainer trainer = null;
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		
		// Write jpql
		String jpql = "from Trainer where emailId =?1";
		
		// Get Query
		Query query = em.createQuery(jpql, Trainer.class);
		query.setParameter(1, emailId);
		// Execute the query and fetch user
				List<Trainer> trainers = query.getResultList();
				
				// Close Entity Manager
				em.close();
				
				
		return trainers.get(0);
	}

	@Override
	public List<Trainer> getTrainers() {
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		
		// Get Entity Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		// Write jpql
		String jpql = "from Trainer";
		
		// Get Query
		Query query = em.createQuery(jpql, Trainer.class);
		
		// Execute the query and fetch user
		List<Trainer> trainers = query.getResultList();
		
		// Close Entity Manager
		et.commit();
		em.close();
		
		return trainers;
	}

}
