package com.github.cotrod.spring.model.impl;

import com.github.cotrod.spring.model.MusicPlayer;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerAnnotatedMethod implements MusicPlayer {

    @MyAnnotation
    @MyAnnotationSecond
    @Override
    public void playMusic() {
        System.out.println("The Strumbellas - Spirits");
    }
}
