package com.github.cotrod.spring.model.impl;

import com.github.cotrod.spring.model.ClassicalMusic;
import com.github.cotrod.spring.model.Music;
import com.github.cotrod.spring.model.MusicPlayer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerWthTwoBeans implements MusicPlayer {
    Music classicalMusic;
    Music rockMusic;

    public MusicPlayerWthTwoBeans(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong() + " and then " + rockMusic.getSong() + "(TwoBeans)");
    }
}
