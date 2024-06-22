package repositories.impl;

import model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import repositories.CommentRepository;

@Repository
@Primary
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}