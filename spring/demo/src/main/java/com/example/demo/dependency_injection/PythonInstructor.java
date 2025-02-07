package com.example.demo.dependency_injection;

public class PythonInstructor implements Instructor{
    @Override
    public String getAllPrograms() {
        return "Write a program to add 2 numbers and then display it in a web page using flask framework";
    }
}
