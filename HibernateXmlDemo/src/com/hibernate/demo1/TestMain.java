package com.hibernate.demo1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.*;


public class TestMain {

  public static void main(String[] args) {
        // Create the objects
	  	Address ad1 = new Address(01,"koramangala","Banglore",560099);
       // u1.setUserId(1);
        
       
        
        //Get Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //Get SessionFactory
        SessionFactory factoy = cfg.buildSessionFactory();
        
        //Get Session
        Session session = factoy.openSession();
        
        //Transaction
        Transaction tx = session.beginTransaction();
        session.save(ad1); //inserting the data into table user1
        System.out.println("User is being saved...");
        
        //Commit
        tx.commit();
        
        //Close
        session.close();
        factoy.close();





  }





}