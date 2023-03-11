package com.cvs;

import com.cvs.model.Comment;
import com.cvs.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CvsApplication {
    /**
     * BootStrapping the application:
     * Because we will be running the application from an executable JAR, it is important to have a main class that will
     * be executed when that JAR file is run.
     * @SpringBootApplication: is a composite annotation that combines the following annotations:
     *     · @SpringBootConfiguration: Designates this class as a configuration class. We can add Java based Spring framework
     *       configuration to this class if we need to. This annotation is specialized form of the @Configuration annotation
     *     · @EnableAutoConfiguration: Enables Spring Boot automatic configuration. It tells Spring Boot to automatically
     *       configure components that it think we will need
     *     · @ComponentScan: Enables component scanning. This lets us declare other classes with annotation like @Component
     *       to have Spring automatically discover and register them as components in the Spring application context.
     * · main() method: calls a static run method on SpringApplication class, which performs the actual bootstrapping
     *     on the application, creating the Spring application context. The 2 parameters passed to run() method are a
     *     configuration class, and the command line arguments.
     *
     */

    public static void main(String[] args) {

        Comment comment =new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");


        // This one will create a container
        ApplicationContext context = SpringApplication.run(CvsApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);




    }

}
