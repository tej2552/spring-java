package org.example.serialize;

import java.io.Serializable;

public class Vehicle implements Serializable {


    private String name;
    public Vehicle(String name) {
        this.name = name;
    }
}
