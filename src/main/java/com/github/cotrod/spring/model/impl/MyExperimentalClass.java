package com.github.cotrod.spring.model.impl;

import org.springframework.stereotype.Component;

@Component
public class MyExperimentalClass {
    public void doSmt3(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("without Annot");
    }

    @MyAnnotationSecond
    public void doSmth(){
        for (int x=0;x<5;x++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Something");
    }
    @MyAnnotation
    public void doSomth2(){
        for (int x=0;x<5;x++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Somethings Second");
    }
}
