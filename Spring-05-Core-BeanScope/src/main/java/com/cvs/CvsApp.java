package com.cvs;

import com.cvs.config.ProjectConfig;
import com.cvs.model.Comment;
import com.cvs.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CvsApp {
    public static void main(String[] args) {

        Comment comment =new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");


        /**
         * When we create container ALL BEANS are created automatically. We should use @Lazy annotation to prevent that
         * @Lazy will prevent creation of the beans until we need them
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /**
         * Singleton scope is default in Spring. Both objects location are the same.
         * When we call bean more than one time and want to get diff object each time we can go to the bean class,
         * and we can use @Scope("prototype") annotation. Then it will return diff objects
         */
        CommentService cs1 = context.getBean(CommentService.class); // Object 1
        CommentService cs2 = context.getBean(CommentService.class); // Object 2

        System.out.println(cs1); // Object 1  - com.cvs.service.CommentService@51c668e3
        System.out.println(cs2); // Object 2  - com.cvs.service.CommentService@51c668e3
        System.out.println(cs1==cs2);// true - If we apply @Scope("prototype") annotation it will return false





    }
}
