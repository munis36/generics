package com.munis.calcenginelambda;

/**
 * Created by MN883H on 1/22/2018.
 */
public class Profit implements QuantityOfInterest {

    private final Sales sales;
    private final IncrementalCosts incrementalCosts;
    private final FixedCosts fixedCosts;

    public Profit(Sales s, IncrementalCosts ic, FixedCosts fc){
        this.sales = s;
        this.incrementalCosts = ic;
        this.fixedCosts = fc;
    }

    @Override
    public String getName(){
        return "Profit!!";
    }

    @Override
    public double valueAt(final int time) {
        return sales.valueAt(time) - (incrementalCosts.valueAt(time) + fixedCosts.valueAt(time));
    }
}
