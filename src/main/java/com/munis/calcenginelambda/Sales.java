package com.munis.calcenginelambda;

/**
 * Created by MN883H on 1/22/2018.
 */
public class Sales implements QuantityOfInterest {

    private final FunctionOverTime valueFunction;

    public Sales(FunctionOverTime valueFunction){
        this.valueFunction = valueFunction;
    }

    @Override
    public String getName() {
        return "Sales";
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}
