package com.github.cotrod.spring.model.impl;

import com.github.cotrod.spring.model.MusicPlayer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:mySongs.properties")
public class MusicPlayerWthPropertiesFile implements MusicPlayer {
    @Value("${song1}")
    String song;

    @Override
    public void playMusic() {
        System.out.println("Playing: " + song + "(Props file)");
    }
}
