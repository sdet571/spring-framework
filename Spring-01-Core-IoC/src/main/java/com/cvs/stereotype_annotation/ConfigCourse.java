package com.cvs.stereotype_annotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Whatever class has @Component annotation on @Configuration, Spring will create a bean instance and will add it into context
 * @ComponentScan - will scan all the Components under com.cvs.stereotype_annotation package and will create the beans
 * @ComponentScan(basePackages = "com.cvs") - will scan all the Component under com.cvs package and will create the beans
 *
 * @Configuration - When we start the application Spring will find the classes with this annotation and will create beans
 *
 */
@Configuration
//@ComponentScan
@ComponentScan(basePackages = "com.cvs")
public class ConfigCourse {



}
