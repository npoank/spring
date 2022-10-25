package org.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
