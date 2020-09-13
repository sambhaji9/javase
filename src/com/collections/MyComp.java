package com.collections;

import java.util.Comparator;

class MyComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // reverse the comparison
        return o2.compareTo(o1);
    }

    // no need to override equals or the default methods
}
