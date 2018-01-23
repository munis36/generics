package com.munis.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by MN883H on 1/16/2018.
 */
public class NewMapReduce {
    public static void main(String[] args){
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1,i2)->i1+i2;
        int reduction = reduce(ints,0,op);

        System.out.println("Reduction : " + reduction);
    }

    static int reduce(List<Integer> values, int valueIfEmpty, BinaryOperator<Integer> reduction){
        int result = valueIfEmpty;

        for (int value : values) {
            result = reduction.apply(result, value);
        }
        return result;
    }
}
