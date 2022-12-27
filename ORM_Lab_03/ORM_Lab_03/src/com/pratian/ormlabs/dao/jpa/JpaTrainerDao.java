package com.pratian.ormlabs.dao.jpa;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.pratian.ormlabs.dao.TrainerDao;
import com.pratian.ormlabs.dao.util.JpaUtil;
import com.pratian.ormlabs.exception.TrainerDoesnotFound;
import com.sa.entities.Organization;
import com.sa.entities.PersonalProfile;
import com.sa.entities.Trainer;

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
	public Trainer getTrainer(long trainerId)  {
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
				@SuppressWarnings("unchecked")
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
		@SuppressWarnings("unchecked")
		List<Trainer> trainers = query.getResultList();
		
		// Close Entity Manager
		et.commit();
		em.close();
		
		return trainers;
	}

	@Override
	public long saveTrainerOrganization(Trainer trainer, Organization organization) {
		
		EntityManager em = JpaUtil.getEntityManager();
		// Begin Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		// Get trainer which already exist in DB
		Trainer trainerFromDb = em.find(Trainer.class, trainer.getTrainerId());
		// Get organization which already exist in DB
		Organization orgFromDB = em.find(Organization.class, organization.getId());
		// Set organization to trainer
		trainerFromDb.setOrganization(orgFromDB);
		// Commit Transaction
		et.commit();
		// Close the Manager
		em.close();
		return orgFromDB.getId();
		
	}

	@Override
	public Organization findTrainerOrganization(long trainerId) {
		Organization organization = null;
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		// Query for trainer_id
		Query query = em.createQuery("select o from Trainer t inner join Organization o "
		+ " on o.name = t.organization.name where t.trainerId =:trainersId");
		// Execute the statement
		query.setParameter("trainersId", trainerId);
		@SuppressWarnings("unchecked")
		List<Organization> organizations = query.getResultList();
		// If list is empty, then assign null
		organization = ((organizations.size() == 0) ? null : organizations.get(0));
		// Close the Manager
		em.close(); 
		// Return the trainer
		return organization;
	}

	@Override
	public List<Trainer> findTrainersOfOrganization(String name) {
		
		
		@SuppressWarnings("unused")
		Trainer trainer=null;
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		// Query for trainer_id
		Query query = em.createQuery("select t from Trainer t inner join Organization o "
		+ " on o.id = t.organization.id where o.name =:name");
		// Execute the statement
		query.setParameter("name", name);
		@SuppressWarnings("unchecked")
		List<Trainer> trainers = query.getResultList();
		// If list is empty, then assign null
		trainer = ((trainers.size() == 0) ? null : trainers.get(0));
		// Close the Manager
		em.close(); 
		// Return the trainer
		return trainers;
	}

	@Override
	public long saveTrainersPersonalProfile(Trainer trainer, PersonalProfile profile) throws TrainerDoesnotFound {
		
		EntityManager em = null;
		
		em=JpaUtil.getEntityManager();
		// Begin Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		// Get trainer which already exist in DB
		Trainer trainerFromDb = em.find(Trainer.class, trainer.getTrainerId());
		
		//get personal profile which already exist in DB
		PersonalProfile personalProfileDb=em.find(PersonalProfile.class, profile.getProfileId());
		if(trainerFromDb==null)
			throw new TrainerDoesnotFound("personal profile doesnot found");
		//set profile to trainer
		trainerFromDb.setPersonalProfile(personalProfileDb);
		
		et.commit();
		em.close();
		
		return personalProfileDb.getProfileId();
		
		
		
	}

	@Override
	public boolean updatePersonalProfile(PersonalProfile profile) {
		
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();

		// Begin Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		PersonalProfile existingProfile=em.find(PersonalProfile.class, profile.getProfileId());
		
		existingProfile.setDateOfBirth(profile.getDateOfBirth());
		existingProfile.setMobileNo(profile.getMobileNo());
		existingProfile.setRelocate(profile.isRelocate());

		// Commit Transaction
		et.commit();

		// Close the Manager
		em.close();

		return true;
	}

	@Override
	public PersonalProfile findTrainersPersonalProfile(long trainerId) throws TrainerDoesnotFound {
		
		PersonalProfile profile=null;
		
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		// Query for trainer_id
		Query query = em.createQuery("select p from PersonalProfile p inner join Trainer t "
				+ " on p.profileId = t.personalProfile.profileId where t.trainerId =:trainersId");
		// Execute the statement
		query.setParameter("trainersId", trainerId);
		@SuppressWarnings("unchecked")
		List<PersonalProfile> personalProfiles = query.getResultList();
		// If list is empty, then assign null
		profile = ((personalProfiles.size() == 0) ? null : personalProfiles.get(0));
		if(profile==null)
			throw new TrainerDoesnotFound("Trainer Not Found");
		// Close the Manager
		em.close(); 
		// Return the trainer
		return profile;
		
		
		
	}

	@Override
	public PersonalProfile getPersonalProfile(long profileId) {
		PersonalProfile profile = null;

		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();

		// Get user by user_id
		profile = em.find(PersonalProfile.class, profileId);

		// Close the manager
		em.close();

		return profile;
	}

	@Override
	public long savePersonalProfile(PersonalProfile profile) {
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();

		// Begin Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();

		// Save / Persist User
		em.persist(profile);//inserting data into table DB

		// Commit Transaction
		et.commit();

		// Close the Manager
		em.close();

		return profile.getProfileId();
	}

}
