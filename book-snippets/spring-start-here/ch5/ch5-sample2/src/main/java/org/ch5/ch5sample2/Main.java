package org.ch5.ch5sample2;

import org.ch5.ch5sample2.service.CommentService;
import org.ch5.ch5sample2.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectCOnfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepo();

        System.out.println(b);
    }
}
