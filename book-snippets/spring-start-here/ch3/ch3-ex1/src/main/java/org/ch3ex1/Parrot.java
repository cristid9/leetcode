package org.ch3ex1;

import lombok.Data;

@Data
public class Parrot {

    private String name;

    public Parrot() {
        System.out.println("Parrot created");
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }

}
