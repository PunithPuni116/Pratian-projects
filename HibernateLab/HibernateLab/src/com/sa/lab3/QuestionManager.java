package com.sa.lab3;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class QuestionManager {
    int addQuestion(Question question){
        int flag = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(question);
            transaction.commit();
            flag = 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            transaction.rollback();
        }
        finally{
            session.close();
        }
        return flag;
    }
}
