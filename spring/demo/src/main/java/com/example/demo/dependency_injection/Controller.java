package com.example.demo.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Instructor myInstructor;

    @Autowired
    public Controller(@Qualifier("javaInstructor")Instructor myInstructor) {
        this.myInstructor = myInstructor;
    }

    @GetMapping("/getPrograms")
    public String getPrograms(){
        return myInstructor.getAllPrograms();
    }
}
