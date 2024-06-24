package org.ch5.sample3;

import org.ch5.sample3.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        System.out.println("Before using comment service");
        var b = context.getBean("commentService", CommentService.class);
        System.out.println("After using comment service");
    }
}
