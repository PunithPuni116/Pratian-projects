package com.sa.lab1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
    public static void main(String[] args) {

        //Creating Object
        Address a1 = new Address();
        a1.setStreetName("1st Main");
        a1.setCity("Bangalore");
        a1.setPincode(560097);

        Configuration cfg = new Configuration();
        cfg.configure("/com/sa/lab1/hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(a1);
        tx.commit();
        session.close();
        factory.close();
    }
}
