package com.cvs.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CvsApp {

    public static void main(String[] args) {

        /**
         * Spring app creates a container
         * AnnotationConfigApplicationContext class looks for @Configuration classes we provided inside the parameter
         * It will go to the @Configuration classes finds and creates the @Beans and stores them in the container
         *
         * getBean(); will return the bean object from container
         *
         */

        //Creating an instance of the Spring Context
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        //Getting reference of a bean from the Spring Context
        // ft is a bean from the container
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        // @Bean(name = "p1") - if we have multiple options, we can specify a name of the bean we would like to be returned on @Configuration class
        //PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);// First parameter is the name of the instance to which we refer.
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);





    }


}
