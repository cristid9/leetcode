package org.ch5.sample3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.ch5.sample3.services"})
public class ProjectConfig {
}
