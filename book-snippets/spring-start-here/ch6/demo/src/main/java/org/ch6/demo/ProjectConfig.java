package org.ch6.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.ch6.demo.services.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.ch6.demo.services")
@EnableAspectJAutoProxy
public class ProjectConfig {


    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
