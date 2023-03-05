package com.cvs.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CvsApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);
        context.getBean(Java.class).getTeachingHours();

    }
}
