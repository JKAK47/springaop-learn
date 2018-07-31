package com.learn.spring.aop.springaoplearn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created by didi on 2018/7/31.
 */
@Aspect
@Configuration
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //Aspect = Pointcut + Advice

    //Weaving & Weaver
    //execution(* PACKAGE.*.*(..))

    @Before("execution(* com.learn.spring.aop.springaoplearn.business.*.*(..))") //Pointcut
    public void before(JoinPoint joinPoint) {
        //Advice
        logger.info("Intercepted a method call - {}", joinPoint);
    }

}
