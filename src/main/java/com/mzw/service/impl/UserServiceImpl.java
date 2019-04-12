package com.mzw.service.impl;

import com.mzw.dao.UserDao;
import com.mzw.entity.User;
import com.mzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;



    @Override
    public User login(String username, String password) {
        User user = userDao.selectOne(username, password);
        return user;
    }
}
