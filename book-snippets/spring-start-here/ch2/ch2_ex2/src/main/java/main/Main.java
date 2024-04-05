package main;

import config.ProjectConfiguration;
import lombok.var;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Parrot p = context.getBean("parrot", Parrot.class);
        System.out.println(p.getName());

        String name = context.getBean(String.class);
        System.out.println(name);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);

    }
}
