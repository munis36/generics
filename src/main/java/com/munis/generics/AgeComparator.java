package com.munis.generics;

import java.util.Comparator;

/**
 * Created by MN883H on 1/8/2018.
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
