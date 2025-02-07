package com.example.demo.dependency_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public PythonInstructor pythonInstructor(){
        return new PythonInstructor();
    }
}
