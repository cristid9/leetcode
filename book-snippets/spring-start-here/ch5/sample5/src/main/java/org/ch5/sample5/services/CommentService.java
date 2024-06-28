package org.ch5.sample5.services;

import org.ch5.sample5.beans.Comment;
import org.ch5.sample5.beans.CommentProcessor;
import org.ch5.sample5.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    public ApplicationContext context;

    @Autowired
    public CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public void sendComment(Comment c) {
        CommentProcessor p = context.getBean(CommentProcessor.class);

        p.setComment(c);
        p.validateComment(c);
        p.processComment(c);

        c = p.getComment();
    }

}
