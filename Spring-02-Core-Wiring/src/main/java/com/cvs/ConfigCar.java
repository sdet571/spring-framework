package com.cvs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    /**
     * There are 2 ways in which we can establish the relationship among beans:
     *   · Wiring : This is the approach where the relationship is implemented by directly calling @Bean annotated method
     *     from the other @Bean annotated method that defines the second bean of the relationship.
     *   · Autowiring : This is the approach where we let Spring provide a value for a parameter we define for the @Bean annotated method.
     *
     *
     */

    @Bean
    Car car1(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    // Direct Wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car()); // direct Wiring
//        return p;
//    }

    // Auto Wiring
    @Bean
    Person person(Car car1){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car1);
        return p;
    }
}
