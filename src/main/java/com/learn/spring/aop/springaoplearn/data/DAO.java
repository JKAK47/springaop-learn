package com.learn.spring.aop.springaoplearn.data;

import org.springframework.stereotype.Repository;

/**
 * Created by didi on 2018/7/27.
 */
@Repository
public class DAO {
    public String getData() {
        return "Retrieve Data";
    }
}
