package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Han on 2017/07/13.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(int userid){

        User user=userDao.getUser(userid);
        return user;
    }
}
