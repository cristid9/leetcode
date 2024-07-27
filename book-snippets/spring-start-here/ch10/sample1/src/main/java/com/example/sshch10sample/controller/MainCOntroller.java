package com.example.sshch10sample.controller;

import com.example.sshch10sample.dto.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainCOntroller {


    @GetMapping("/all")
    public List<Country> all() {
        Country c1 = Country.of("france", 67);
        Country c2 = Country.of("germany", 68);
        return List.of(c1, c2);
    }

    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country c1 = Country.of("france", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "europe")
                .header("capital", "paris")
                .header("favorite_food", "cheese and wine")
                .body(c1);
    }
}
