package com.munis.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by MN883H on 1/8/2018.
 */
public class GenericsTest {
    public static void main(String[] args){
        Person p1 = new Person("Munis", 44);
        Person p2 = new Person("Ammu", 40);
        Person p3 = new Person("Pandia", 46);
        Person p4 = new Person("Subhi", 16);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p4);
        list.add(p3);

        System.out.println(list);

        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };

        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

//        Collections.sort(list,ageComparator);
//        System.out.println(list);
//        Collections.sort(list,nameComparator);
//        System.out.println(list);

        Collections.sort(list,new AgeComparator());
        System.out.println(list);

        Collections.sort(list,new ReverseComparator<>(new AgeComparator()));
        System.out.println(list);
    }

}
