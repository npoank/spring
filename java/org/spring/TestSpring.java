package org.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicMusic classicMusic1 = context.getBean("classicMusic", ClassicMusic.class);
        ClassicMusic classicMusic2 = context.getBean("classicMusic", ClassicMusic.class);
        System.out.println(classicMusic1 == classicMusic2);

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        context.close();
    }
}
