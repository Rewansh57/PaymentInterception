package com.example.learn.SpringStartsHere.service;

import com.example.learn.SpringStartsHere.model.Comment;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger =
            Logger.getLogger(CommentService.class.getName());

    public CommentService() {
    }

    public void publishComment(Comment comment){
        logger.info(comment.getAuthor()+" "+comment.getText());

        // Currently empty
    }
}
