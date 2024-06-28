package org.ch5.sample5;

import org.ch5.sample5.services.CommentService;
import org.ch5.sample5.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean("commentService", CommentService.class);
        var cs2 = context.getBean("userService", UserService.class);

        boolean b1 = cs1.getCommentRepository() == cs2.getCommentRepository();

        System.out.println(b1);
    }
}
