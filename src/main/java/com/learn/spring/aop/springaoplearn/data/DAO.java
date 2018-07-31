package com.learn.spring.aop.springaoplearn.data;

import com.learn.spring.aop.springaoplearn.aspect.TrackTime;
import org.springframework.stereotype.Repository;

/**
 * Created by didi on 2018/7/27.
 */
@Repository
public class DAO {
    @TrackTime
    public String getData() {
        return "Retrieve Data";
    }
}
