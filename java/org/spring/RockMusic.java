package org.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "some rock music";
    }

    @PostConstruct
    public void doConstruct (){
        System.out.println("Construct bean rockMusic");
    }

    @PreDestroy
    public void doDestry(){
        System.out.println("Destroy bean rockMusic");
    }
}
