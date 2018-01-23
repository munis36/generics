package com.munis.calcenginelambda;

/**
 * Created by MN883H on 1/22/2018.
 */
public class FixedCosts implements QuantityOfInterest {

    private final FunctionOverTime valueFunction;

    public FixedCosts(FunctionOverTime valueFunction){
        this.valueFunction = valueFunction;
    }

    @Override
    public String getName() {
        return "Fixed Costs";
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}
