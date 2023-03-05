package com.cvs;

import com.cvs.config.ProjectConfig;
import com.cvs.model.Comment;
import com.cvs.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CvsApp {
    public static void main(String[] args) {

        /**
         * · Which Objects Should Be Part of The Spring Container ?
         * We need to add the object to the Spring container if it either has a dependency we need to inject from the
         * context or if it is a dependency itself.
         */



        Comment comment =new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);




    }


}
