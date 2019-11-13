package com.github.cotrod.spring.model.impl;

import com.github.cotrod.spring.model.ClassicalMusic;
import com.github.cotrod.spring.model.MusicPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerWthBeanField implements MusicPlayer {
    @Autowired
    ClassicalMusic classicalMusic;

    @Override
    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong() + "(Field)");
    }
}
