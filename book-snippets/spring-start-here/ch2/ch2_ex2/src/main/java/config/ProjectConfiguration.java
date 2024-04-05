package config;

import lombok.var;
import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfiguration {

    @Bean
    @Primary
    Parrot parrot() {
        var parot = new Parrot();
        parot.setName("Parrot");
        return parot;
    }

    @Bean
    Parrot parrot2() {
        var parot = new Parrot();
        parot.setName("Koko");
        return parot;
    }

    @Bean
    Parrot parrot3() {
        var parot = new Parrot();
        parot.setName("Miki");
        return parot;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
