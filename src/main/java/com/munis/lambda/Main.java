package com.munis.lambda;

/**
 * Created by mnagarat on 1/9/18.
 */
public class Main {
    public static void main(String[] args){
        Predicate<String> stringLessThan20 = s -> s.length() < 20;
        Predicate<String> stringGreaterThan5 = s -> s.length() > 5;

        boolean _one = stringLessThan20.test("Hello");

        System.out.println("The string Hello is less than 20 chars "+_one);

        Predicate<String> strBetween5And20 = stringGreaterThan5.and(stringLessThan20);

        System.out.println("Check and operation " + strBetween5And20.test("Muniyasamy Nagarathinam"));

        Predicate<String> YES = Predicate.isEqualsTo("Yes");
        System.out.println(" YES equals to " + YES.test("Yes"));
    }
}
