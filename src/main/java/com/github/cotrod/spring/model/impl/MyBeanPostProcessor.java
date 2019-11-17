package com.github.cotrod.spring.model.impl;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    private Map<String, List<Method>> annotatedMethods = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (Method method : bean.getClass().getDeclaredMethods()) {
            List<Method> methods = annotatedMethods.get(beanName);
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                if (methods == null) {
                    methods = new ArrayList<>();

                }
                methods.add(method);
                annotatedMethods.put(beanName, methods);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        List<Method> methods = annotatedMethods.get(beanName);
        if (methods != null){
            ProxyFactory proxyFactory = new ProxyFactory();
            proxyFactory.addAdvice(new MyProxy());
            proxyFactory.setTarget(bean);
            return proxyFactory.getProxy();
        }
        return bean;
    }
}
