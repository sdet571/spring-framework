package com.cvs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.cvs")
//@ComponentScan(basePackages = {"com.cvs.proxy","com.cvs.service","com.cvs.repository"})
public class ProjectConfig {

}
