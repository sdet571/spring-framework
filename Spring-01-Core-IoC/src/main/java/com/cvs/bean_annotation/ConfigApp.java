package com.cvs.bean_annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
/**
 * When we start the application, Spring will find the classes with @Configuration annotation and will create beans and
 * store them inside the container
 *
 * @Primary - Default choice of Spring. Spring will choose primary if it has multiple options, and we do not specify a name.
 *
 * @Bean(name = "p1") - if we have multiple options, we also can use bean with name
 */
@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

//    @Bean(name = "p1")
    @Bean
    @Primary // Spring will return @Primary bean
    PartTimeMentor partTimeMentor(){ return new PartTimeMentor(); }

//    @Bean(name = "p2")
    @Bean
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }





}
