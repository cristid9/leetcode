package com.example.feignclientch11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.feignclientch11.clients")
public class Feignclientch11Application {

    public static void main(String[] args) {
        SpringApplication.run(Feignclientch11Application.class, args);
    }

}
