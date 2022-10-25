package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

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
