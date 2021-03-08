package com.javadeveloperzone.controller;

import com.fasterxml.classmate.AnnotationConfiguration;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;


public class HibernateMapping {


   private static final SessionFactory sessionFactory ;

    static {
        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.configure();
        sessionFactory = annotationConfiguration.buildSessionFactory();
    }

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
   private static  SessionFactory sessionFactory1=null;
    @Autowired
   HibernateConfiguration hibernateConfiguration;

    public void saveMethod(User user2)
    {
        sessionFactory1 = (SessionFactory) hibernateConfiguration.sessionFactory();
        Session session;
        session= sessionFactory1.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(user2);
        transaction.commit();
        session.close();

    }
}
