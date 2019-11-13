package com.github.cotrod.spring.model.impl;

import com.github.cotrod.spring.model.MusicPlayer;
import org.springframework.stereotype.Component;

@Component
public class SimpleMusicPlayerAnnotation implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Playing Music (Player Annotation) :)");
    }
}
