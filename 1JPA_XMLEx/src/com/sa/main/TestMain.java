package com.sa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.sa.entities.User;

public class TestMain {

	public static void main(String[] args) {
		// create the objects
		User u1 = new User();
		u1.setUserName("Sreeja");
		u1.setAge(20);
		
		//Get Entity Manager Factory - use persistence unit name
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin(); //Begin Transaction
		
		em.persist(u1); //insert the data into table
		
		em.getTransaction().commit();
		
		em.close();
		
		factory.close();
		
	}

}
