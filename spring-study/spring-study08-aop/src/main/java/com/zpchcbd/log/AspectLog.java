package com.zpchcbd.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectLog{
    @Before("execution(* com.zpchcbd.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before...");
    }


    @After("execution(* com.zpchcbd.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after...");
    }

    @Around("execution(* com.zpchcbd.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before");
        proceedingJoinPoint.proceed();
        System.out.println("around after");


    }
}
