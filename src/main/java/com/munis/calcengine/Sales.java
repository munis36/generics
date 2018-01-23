package com.munis.calcengine;

/**
 * Created by MN883H on 1/22/2018.
 */
public class Sales extends MonthByMonthQuantity {

    public Sales(final double[] values){
        super(values);
    }

    @Override
    public String getName() {
        return "Expected Sales";
    }
}
