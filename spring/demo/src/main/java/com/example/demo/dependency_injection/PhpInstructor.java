package com.example.demo.dependency_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PhpInstructor implements Instructor{

    public PhpInstructor() {
        System.out.println("Constructor : " +getClass().getSimpleName());
    }

    @Override
    public String getAllPrograms() {
        return "Write a PHP Program to add two numbers";
    }
}
