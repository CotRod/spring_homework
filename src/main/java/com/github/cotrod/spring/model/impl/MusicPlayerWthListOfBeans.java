package com.github.cotrod.spring.model.impl;

import com.github.cotrod.spring.model.Music;
import com.github.cotrod.spring.model.MusicPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayerWthListOfBeans implements MusicPlayer {
    List<Music> musicList;

    @Autowired
    public MusicPlayerWthListOfBeans(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing:");
        musicList.forEach(music -> System.out.println(music.getSong()));
        System.out.println("(List of Beans)");
    }
}
