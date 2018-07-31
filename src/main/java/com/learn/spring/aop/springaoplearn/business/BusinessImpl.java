package com.learn.spring.aop.springaoplearn.business;

import com.learn.spring.aop.springaoplearn.aspect.TrackTime;
import com.learn.spring.aop.springaoplearn.data.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by didi on 2018/7/27.
 */
@Service
public class BusinessImpl {
    @Autowired
    private DAO dao;

    @TrackTime
    public String calculate() {
        return dao.getData();
    }
}
