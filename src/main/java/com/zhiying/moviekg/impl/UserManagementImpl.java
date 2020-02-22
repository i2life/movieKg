package com.zhiying.moviekg.impl;

import com.zhiying.moviekg.db.dao.UserDao;
import com.zhiying.moviekg.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManagementImpl implements UserManagementService {
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(String userName) {

        userDao.insertUser(userName);

    }
}
