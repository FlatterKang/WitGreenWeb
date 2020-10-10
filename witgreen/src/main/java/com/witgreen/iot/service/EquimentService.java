package com.witgreen.iot.service;


import com.witgreen.iot.bean.Equiment;
import com.witgreen.iot.dao.EquimentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquimentService {

    private EquimentDao equimentDao;

    @Autowired
    public EquimentService(EquimentDao equimentDao) {
        this.equimentDao = equimentDao;
    }

    public List findEquimentByUserId(Integer id){

        return equimentDao.findEquimentByUserId(id);
    }
}
