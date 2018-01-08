package com.munis.generics;

import sun.awt.datatransfer.DataTransferer;

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

        SortedPair<Integer> pair = new SortedPair<>(2,1);
        System.out.println("Sorted Pair");
        System.out.println(pair.getFirst().intValue());
        System.out.println(pair.getSecond().intValue());

        System.out.println("Youngest person");
        final Person youngestPerson = min(list, new AgeComparator());
        System.out.println(youngestPerson);

        /*
        System.out.println("Oldest Person");
        final Person oldestPerson = (Person)min(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Smallest number");
        System.out.println(min(numbers,Integer::compare));

    }

    public static <T>  T min(List<T> values, Comparator<T> comparator){
        if (values.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }

        T lowestElement  = values.get(0);
        for(int i = 1; i < values.size(); i++){
            final T element = values.get(i);
            if(comparator.compare(element,lowestElement)<0){
                lowestElement = element;
            }
        }

        return lowestElement;
    }
    public static Object minOld(List values, Comparator comparator){

        if (values.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }

        Object lowestElement  = values.get(0);
        for(int i = 1; i < values.size(); i++){
            final Object element = values.get(i);
            if(comparator.compare(element,lowestElement)<0){
                lowestElement = element;
            }
        }

        return lowestElement;
    }
}
