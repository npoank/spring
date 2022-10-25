package org.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicMusic(), rockMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
