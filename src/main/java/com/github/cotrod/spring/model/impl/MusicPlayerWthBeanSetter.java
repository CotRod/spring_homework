package com.github.cotrod.spring.model.impl;

import com.github.cotrod.spring.model.ClassicalMusic;
import com.github.cotrod.spring.model.MusicPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerWthBeanSetter implements MusicPlayer {
    ClassicalMusic classicalMusic;

    @Autowired
    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong() + "(Setter)");
    }
}
