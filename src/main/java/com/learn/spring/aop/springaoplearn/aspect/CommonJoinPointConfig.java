package com.learn.spring.aop.springaoplearn.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by didi on 2018/7/31.
 */
public class CommonJoinPointConfig {
    @Pointcut("execution(* com.learn.spring.aop.springaoplearn.data.*.*(..))")
    public void dataLayerExecution() {

    }

    @Pointcut("execution(* com.learn.spring.aop.springaoplearn.business.*.*(..))")
    public void businessLayerExecution() {

    }
}
