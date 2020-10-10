package com.witgreen.iot;

import com.witgreen.iot.bean.Equiment;
import com.witgreen.iot.bean.User;
import com.witgreen.iot.dao.EquimentDao;
import com.witgreen.iot.dao.UserDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan("com.witgreen.iot")
public class IotApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(IotApplication.class, args);

        UserDao userDao = (UserDao) context.getBean(UserDao.class);
        User user1 = userDao.findUserByName("user1");
        System.out.println(user1.toString());

        EquimentDao equimentDao =(EquimentDao) context.getBean(EquimentDao.class);
        List <Equiment> equiment=equimentDao.findEquimentByUserId(1);
        System.out.println(equiment);
    }

}
