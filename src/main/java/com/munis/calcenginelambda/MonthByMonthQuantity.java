package com.munis.calcenginelambda;

/**
 * Created by MN883H on 1/22/2018.
 */
abstract class MonthByMonthQuantity implements QuantityOfInterest {
    private final double[] values;
    protected MonthByMonthQuantity(final double[] values){
        this.values = values;
    }

    @Override
    public double valueAt(int time) {
        return values[time - 1];
    }
}
