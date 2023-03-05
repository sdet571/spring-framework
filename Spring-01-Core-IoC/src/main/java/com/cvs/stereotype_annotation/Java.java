package com.cvs.stereotype_annotation;

import org.springframework.stereotype.Component;

@Component // - Tell Spring to add an instance of this class in its context
public class Java {
    public void getTeachingHours(){
        System.out.println("Total teaching hours: 250");
    }

}
