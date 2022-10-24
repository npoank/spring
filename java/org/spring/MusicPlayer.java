package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
   private ClassicMusic classicMusic;
   private RockMusic rockMusic;

   @Autowired
   public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Playing " + classicMusic.getSong());
        System.out.println("Playing " + rockMusic.getSong());
    }
}
