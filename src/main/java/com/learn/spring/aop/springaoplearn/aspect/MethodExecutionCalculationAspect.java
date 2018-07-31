package com.learn.spring.aop.springaoplearn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created by didi on 2018/7/31.
 */
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //Aspect = Pointcut + Advice

    //Weaving & Weaver
    //execution(* PACKAGE.*.*(..))

    @Around("com.learn.spring.aop.springaoplearn.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        //Advice

        //Start time - x
        //allow execution of method
        //End time - y

        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is - {}", joinPoint, timeTaken);
    }
}
