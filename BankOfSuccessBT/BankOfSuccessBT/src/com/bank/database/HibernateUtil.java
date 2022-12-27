package com.bank.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Application.Account;
import com.Application.Current;
import com.Application.Savings;

public class HibernateUtil {
	
	public Session hibernateUtil() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
	
		Session session = factory.openSession();
		return session;
	}
	public void saveAccountData(Account account) {
		
		Session session = hibernateUtil();
	
		Transaction tx = session.beginTransaction();
		session.save(account);
		tx.commit();
	}
	
	public Account getAccountData(int accountNumber) {
		
	
		Session session = hibernateUtil();
	
		Transaction tx = session.beginTransaction();
		Account account=session.get(Account.class,accountNumber);
		if(account instanceof Savings) {
			 account=(Savings)account;
		}
		else{
			account=(Current)account;
		}
		
		tx.commit();
		return account;
		
	}
	public void UpdateAccountData(Account account) {
		Session session= hibernateUtil();
		if(account instanceof Savings) {
			 account=(Savings)account;
		}
		else{
			account=(Current)account;
		}
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(account);
		tx.commit();
	}

}
