package com.javadeveloperzone.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User saveMethod(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(user);
        return user;
    }
}
