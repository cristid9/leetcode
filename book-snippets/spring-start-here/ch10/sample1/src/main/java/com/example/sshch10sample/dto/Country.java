package com.example.sshch10sample.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {

    private String name;
    private int population;

    public static Country of(String name, int population) {
        Country country = new Country();
        country.name = name;
        country.population = population;
        return country;
    }
}
