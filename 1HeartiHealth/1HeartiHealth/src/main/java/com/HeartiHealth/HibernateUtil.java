package com.HeartiHealth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public void saveData(Object obj) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
    
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
    
		Transaction tx = session.beginTransaction();
		
		session.save(obj);
		tx.commit();
	}
	
public void updateData(Object obj) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
    
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
    
		Transaction tx = session.beginTransaction();
		
		session.update(obj);
		tx.commit();
	}
}
