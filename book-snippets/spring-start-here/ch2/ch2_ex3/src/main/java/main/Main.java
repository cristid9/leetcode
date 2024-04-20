package main;

import configuration.Config;
import lombok.var;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot);
        System.out.println(parrot.getName());

        var cat = new Cat();
        cat.setName("Dasha");

        Supplier<Cat> catSupplier = () -> cat;
        context.registerBean("dasha", Cat.class, catSupplier, bc -> bc.setPrimary(true));

        System.out.println(context.getBean("dasha"));

    }
}
