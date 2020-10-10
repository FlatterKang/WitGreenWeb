package com.witgreen.iot.service;


import com.witgreen.iot.bean.User;
import com.witgreen.iot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao blogDao) {
        this.userDao = blogDao;
    }

    public User getDetailById(Integer id){
        return userDao.findUserInforById(id);
    }
}
