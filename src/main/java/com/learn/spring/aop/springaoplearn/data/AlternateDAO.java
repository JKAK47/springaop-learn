package com.learn.spring.aop.springaoplearn.data;

import org.springframework.stereotype.Repository;

/**
 * Created by didi on 2018/7/27.
 */
@Repository
public class AlternateDAO {
    public String getData() {
        return "Retrieve Alternative Data";
    }
}
