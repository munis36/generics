package com.munis.calcengine;

/**
 * Created by MN883H on 1/22/2018.
 */
public interface QuantityOfInterest {
    String getName();

    /**
     * expected value for a particular month
     * @param time month, 1-12
     * @return expected value
     */

    double valueAt(final int time);
}
