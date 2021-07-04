package com.company;

import java.io.Serializable;

public class Person implements Serializable {
    private final String name;
    private final String lastName;
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
