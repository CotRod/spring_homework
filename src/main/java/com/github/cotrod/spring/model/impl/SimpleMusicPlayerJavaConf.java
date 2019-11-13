package com.github.cotrod.spring.model.impl;

import com.github.cotrod.spring.model.MusicPlayer;

public class SimpleMusicPlayerJavaConf implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Playing Music (Player Java Configuration) :)");
    }
}