package com.witgreen.iot.dao;


import com.witgreen.iot.bean.Equiment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquimentDao {

    List <Equiment> findEquimentByUserId(Integer id);
}
