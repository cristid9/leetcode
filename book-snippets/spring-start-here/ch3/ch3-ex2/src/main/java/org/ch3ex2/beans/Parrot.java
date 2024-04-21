package org.ch3ex2.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Parrot {
    private String name = "Koko";
    private final Person person;

    @Autowired
    public Parrot(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
