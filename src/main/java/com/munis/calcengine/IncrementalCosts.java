package com.munis.calcengine;

/**
 * Created by MN883H on 1/22/2018.
 */
public class IncrementalCosts extends PolynomialQuantity {

    public IncrementalCosts(final double intercept, final double slope){
        super(new double[]{intercept,slope});
    }

    @Override
    public String getName() {
        return "Incremental Costs";
    }

}
