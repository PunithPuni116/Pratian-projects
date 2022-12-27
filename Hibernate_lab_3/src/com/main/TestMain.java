package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sa.entities.Address;

public class TestMain {

	public static void main(String[] args) {
		// create the objects
		Address address1 = new Address("ABC","Bangalore",123456L);
		Address address2 = new Address("ABCD","Chennai",451234L);
		Address address3 = new Address("ABCDE","Mumbai",211234L);
		Address address4 = new Address("ABCDEF","Delhi",12345632L);
		
		
		//Get Entity Manager Factory - use persistence unit name
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin(); //Begin Transaction
		//insert the data into table
		em.persist(address1);
		em.persist(address2);
		em.persist(address3);
		em.persist(address4);
		//insert the data into table
		
		em.getTransaction().commit();
		
		em.close();
		
		factory.close();
		
	}

}
