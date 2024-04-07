package main;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Getter
@Setter
public class Parrot {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Parrot";
    }
}
