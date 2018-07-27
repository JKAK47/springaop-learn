package com.learn.spring.aop.springaoplearn.business;

import com.learn.spring.aop.springaoplearn.data.AlternateDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by didi on 2018/7/27.
 */
@Service
public class AlternateBusinessImpl {
    @Autowired
    private AlternateDAO dao;

    public String calculate() {
        return dao.getData();
    }
}
