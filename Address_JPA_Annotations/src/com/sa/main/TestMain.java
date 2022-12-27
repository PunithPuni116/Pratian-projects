package com.sa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sa.address.Address;

public class TestMain {

	public static void main(String[] args) {
		// Create the objects
        Address a1 = new Address();
        //a1.setId(268364);
        a1.setStreetName("Rose Garden");
        a1.setCity("Bengaluru");
        a1.setPincode(560002);
        
        Address a2 = new Address();
        //a2.setId(2572256);
        a2.setStreetName("Central");
        a2.setCity("Bengaluru");
        a2.setPincode(560003);
        
        Address a3 = new Address();
        //a3.setId(762534);
        a3.setStreetName("KT Street");
        a3.setCity("Mysore");
        a3.setPincode(570003);
        
        Address a4 = new Address();
        //a4.setId(576345);
        a4.setStreetName("MG Road");
        a4.setCity("Bengaluru");
        a4.setPincode(560004);
        
        Address a5 = new Address();
        //a5.setId(526532);
        a5.setStreetName("jatre road");
        a5.setCity("Bengaluru");
        a5.setPincode(560003);
        		
        		//Get Entity Manager Factory - use persistence unit name
        		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        		
        		EntityManager em = factory.createEntityManager();
        		
        		em.getTransaction().begin(); //Begin Transaction
        		
        		em.persist(a1);
        		em.persist(a2);
        		em.persist(a3);
        		em.persist(a4);
        		em.persist(a5);//insert the data into table
        		
        		em.getTransaction().commit();
        		
        		em.close();
        		
        		factory.close();
        		
        	}

        }