package com.company;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String lastName;
    public Person(String name, String lastName){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
