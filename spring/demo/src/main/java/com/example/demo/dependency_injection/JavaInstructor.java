package com.example.demo.dependency_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class JavaInstructor implements Instructor {

    public JavaInstructor() {
        System.out.println("Constructor : " +getClass().getSimpleName());
    }

    @Override
    public String getAllPrograms() {
        return "Write a Java program to add two numbers";
    }
}
