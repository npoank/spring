package org.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicMusic classicMusic = context.getBean("musicBean", ClassicMusic.class);
        System.out.println(classicMusic.getSong());


//        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstmusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstmusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstmusicPlayer.setVolume(10);
//
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//
        context.close();
    }
}
