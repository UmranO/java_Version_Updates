package com.cydeo;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (01>02) ? -1 :(01<02) ? 1 :0;
    }
}
