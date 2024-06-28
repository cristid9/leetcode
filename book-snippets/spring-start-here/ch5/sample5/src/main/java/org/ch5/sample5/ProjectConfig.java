package org.ch5.sample5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.ch5.sample5.services", "org.ch5.sample5.repositories"})
public class ProjectConfig {
}
