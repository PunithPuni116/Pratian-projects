package com.sa.lab3;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactoryInstance;
    public static SessionFactory getSessionFactory(){
        if(sessionFactoryInstance==null){
            Configuration configuration = new Configuration();
            configuration = configuration.configure("/com/sa/lab3/hibernate.cfg.xml");
            sessionFactoryInstance = configuration.buildSessionFactory();
        }
        return sessionFactoryInstance;
    }
}
