package org.ch3ex1.config;

import org.ch3ex1.Parrot;
import org.ch3ex1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {
        var p = new Person();
        p.setName("Maria");
        p.setParrot(parrot);
        return p;
    }
}
