package com.github.cotrod.spring.model.impl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyProxy implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        if (invocation.getMethod().isAnnotationPresent(MyAnnotation.class)) {
            long start = System.currentTimeMillis();
            Object proceed = invocation.proceed();
            long end = System.currentTimeMillis();
            System.out.println("Execution time is " + (end - start) + " ms (BPP with Proxy)");
            return proceed;
        }else {
            return invocation.proceed();
        }
    }
}
