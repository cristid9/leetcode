package org.ch5.ch5sample2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"org.ch5.ch5sample2.service", "org.ch5.ch5sample2.repository"}
)
public class ProjectCOnfig {
}
