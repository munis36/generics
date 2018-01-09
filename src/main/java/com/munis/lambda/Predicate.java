package com.munis.lambda;

/**
 * Created by mnagarat on 1/9/18.
 */

@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);

    default public Predicate<T> and(Predicate<T> other){
        return s -> test(s) && other.test(s);
    }

    default public Predicate<T> or(Predicate<T> other){
        return s -> test(s) || other.test(s);
    }

    public static <U> Predicate<U> isEqualsTo(U u){
        return s -> s.equals(u);
    }
}
