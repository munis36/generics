package com.munis.calcenginelambda;

/**
 * Created by MN883H on 1/22/2018.
 */
public class IncrementalCosts implements QuantityOfInterest {

    private final FunctionOverTime valueFunction;

    public IncrementalCosts(FunctionOverTime valueFunction){
        this.valueFunction = valueFunction;
    }

    @Override
    public String getName() {
        return "Incremental Costs";
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}
