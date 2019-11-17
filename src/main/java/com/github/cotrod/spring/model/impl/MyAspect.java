package com.github.cotrod.spring.model.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyAspect {
    @Around("@annotation(MyAnnotationSecond)")
    public Object executionTme(ProceedingJoinPoint joinPoint){
        long start = System.currentTimeMillis();

        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        long executionTime = System.currentTimeMillis() - start;

        System.out.println("Executed in " + executionTime + " ms (Aspect)");
        return proceed;
    }
}
