package com.munis.java8date;

import java.time.LocalDate;

/**
 * Created by MN883H on 1/23/2018.
 */
public class Person {
    private String name;
    private LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", dateOfBirth=" + dateOfBirth + "}";
    }
}
