package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music1;

    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private Music music2;


    public String playMusic() {
        return "Playing " + music1.getSong() + ", " + music2.getSong();
    }
}
