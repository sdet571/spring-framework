package com.cvs.bean_annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Stereotype annotations (@Component, @ComponentScan) can not be used for classes that you can not change.
 * We should always follow @Bean structure.
 * For ex: string, Integer etc... We can't edit String or Integer class...
 *
 *
 */
@Configuration
public class ConfigAny {

    @Bean
    String str(){
        return "Developer";
    }

    @Bean
    Integer number(){
        return 100;
    }

}
