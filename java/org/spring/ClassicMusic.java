package org.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "some classical music";
    }
}
