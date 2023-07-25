package com.springmvc.dao;

import com.springmvc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//this is dao layer or database access layer
//@Repository - user to declare any java class as data access layer 
//don't need to create bean externally
@Repository
public class UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //method for save user data into database
    @Transactional
    public int saveUser(User user) {

        int id = (int) this.hibernateTemplate.save(user);

        return id;
    }
}
