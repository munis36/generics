package com.munis.generics;

import java.util.Comparator;

/**
 * Created by MN883H on 1/8/2018.
 */
public class ReverseComparator<T> implements Comparator<T> {

    private Comparator<T> delegateComparator;

    public ReverseComparator(Comparator delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    public Comparator getDelegateComparator() {
        return delegateComparator;
    }

    public void setDelegateComparator(Comparator delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(T o1, T o2) {
        return -1 * delegateComparator.compare(o1,o2);
    }
}
