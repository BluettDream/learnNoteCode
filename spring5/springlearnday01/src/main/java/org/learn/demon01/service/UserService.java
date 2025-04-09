package org.learn.demon01.service;

import org.learn.demon01.dao.UserDao;
import org.learn.demon01.dao.UserDaoimpl;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        System.out.println("service add ...........");
        userDao.update();
    }
}
