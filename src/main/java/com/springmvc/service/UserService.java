package com.springmvc.service;

import com.springmvc.dao.UserDao;
import com.springmvc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//This is service layer
//@Service - annotation used to declare any java class as service layer
//don't need to declare bean externally spring will manage by itself
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    //method for save user into database using user dao
    public int createUser(User user) {

        int id = this.userDao.saveUser(user);

        return id;
    }
}
