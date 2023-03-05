package com.cvs.stereotype_annotation;

import org.springframework.stereotype.Component;

@Component // whatever class has @Component annotation, Spring will create a beans for this class methods
public class Selenium {
    public void getTeachingHours(){
        System.out.println("Total teaching hours: 200");
    }
}
