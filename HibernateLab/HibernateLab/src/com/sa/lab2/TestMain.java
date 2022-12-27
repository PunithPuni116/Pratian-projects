package com.sa.lab2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
    public static void main(String[] args) {
        Address address = new Address();
        address.setPincode(560087);
        address.setCity("Bengaluru");
        address.setStreetName("2nd Main");

        Address address1 = new Address("Singapura road", "bengaluru", 560097);

        Configuration configuration = new Configuration();
        configuration.configure("/com/sa/lab2/hibernate.cfg.xml");

        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(address);
        session.save(address1);
        transaction.commit();
        session.close();
        factory.close();
    }
}
