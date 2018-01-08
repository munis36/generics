package com.munis.generics;

/**
 * Created by MN883H on 1/8/2018.
 */
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person:{"+
                "name : " + this.getName() +
                ", age : " + this.getAge() +
                "}";
    }
}
