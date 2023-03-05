package com.cvs;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * ° Dependency Injection is a fundamental aspect of the Spring framework, through which the Spring container "injects"
 * objects into other objects or “dependencies”.
 * ° DI is an application of the IoC principle. The IoC principle implied that the framework controls the application at execution.
 *
 *
 * ° Starting with Spring version 4.3, when you only have one constructor in the class, you can omit writing the @Autowired annotation.
 *
 * @Autowired -> Spring Inject OfficeHours object to Java Object
 */

@Component
@AllArgsConstructor // Constructor Injection (@Autowired). Injecting the values through the constructor
public class Java {

    OfficeHours officeHours; // OfficeHours dependency

    // 1. Field Injection (Not recommended)
//    @Autowired
//    OfficeHours officeHours;


    // 2. Constructor Injection
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
