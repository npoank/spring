package org.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "some classical music";
    }
}
