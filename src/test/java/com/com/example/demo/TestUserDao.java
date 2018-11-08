package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import solar.demo.dao.UserDao;
import solar.demo.entity.UserInfo;

public class TestUserDao {
	@Test
    public void contextLoads() {
    }

    @Autowired
    private UserDao testUserDao;

    @Test
    public void insert() {
        UserInfo user= new UserInfo();
        user.setUsername("zhang san");
        user.setAge(23);
        testUserDao.save(user);
    }

    @Test
    public void update() {
        UserInfo user = new UserInfo();
        user.setUserid("1");
        user.setAge(18);
        user.setUsername("李四");
        testUserDao.save(user);
    }

    @Test
    public void select() {
        List users = testUserDao.findAll();
        System.out.println(users);
    }

    @Test
    public void delete() {
        testUserDao.delete(1);
    }
}

