package com.hibernate_lab;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public void SaveDate(Question question) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
	
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		if(question instanceof HandsOnQuestion) {
			question=(HandsOnQuestion)question;
			}
		else {
			question=(McqQuestion)question;
		}
		session.save(question);
		tx.commit();
	}
	
	
	
}
