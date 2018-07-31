package com.learn.spring.aop.springaoplearn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created by didi on 2018/7/31.
 */
@Aspect
@Configuration
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //Aspect = Pointcut + Advice

    //Weaving & Weaver
    //execution(* PACKAGE.*.*(..))

    @AfterReturning(value="execution(* com.learn.spring.aop.springaoplearn.business.*.*(..))", returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        //Advice
        logger.info("{} returned with the value - {}", joinPoint, result);
    }

    @AfterThrowing(value="execution(* com.learn.spring.aop.springaoplearn.business.*.*(..))", throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        //Advice
        logger.info("{} throw exception - {}", joinPoint, exception);
    }

    @After(value="execution(* com.learn.spring.aop.springaoplearn.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        //Advice
        logger.info("After execution of {}", joinPoint);
    }

}
