package com.witgreen.iot.dao;

import com.witgreen.iot.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User findUserByName(String username);

    User findUserInforById(Integer id);
}
