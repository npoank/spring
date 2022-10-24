package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicMusic classicMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic) {
        this.classicMusic = classicMusic;
    }

    public void playMusic() {
        System.out.println("Playing " + classicMusic.getSong());
    }
}
