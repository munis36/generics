package com.munis.calcengine;

/**
 * Created by MN883H on 1/22/2018.
 */
public class FixedCosts extends PolynomialQuantity {

    public FixedCosts(double constant){
        super(new double[]{constant});
    }

    @Override
    public String getName() {
        return "Fixed Costs";
    }
}
