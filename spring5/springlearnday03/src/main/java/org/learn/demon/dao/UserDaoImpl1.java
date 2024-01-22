package org.learn.demon.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl1 implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add......");
    }
}
