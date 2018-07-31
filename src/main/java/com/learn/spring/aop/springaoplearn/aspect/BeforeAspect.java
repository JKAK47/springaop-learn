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

    //execution(* PACKAGE.*.*(..))
    @Before("execution(* com.learn.spring.aop.springaoplearn.business.BusinessImpl.*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("Intercepted a method call - {}", joinPoint );
    }

}
