package org.ch5.ch5sample2.service;

import org.ch5.ch5sample2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    public CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

}
