package org.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("classicMusic", ClassicMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music1 = context.getBean("rockMusic", RockMusic.class);
        MusicPlayer rockPlayer = new MusicPlayer(music1);
        rockPlayer.playMusic();

        context.close();
    }
}
