package com.github.cotrod.spring.model;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    public String getSong(){
        return "Polonaise Farewell";
    }
}
