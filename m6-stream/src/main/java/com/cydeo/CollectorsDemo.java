package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("---------------toCollection(Supplier)-------------------");

        //toCollection(Supplier) : is used to create a Collection using Collector
        numbers.stream()
                .filter(p->p%2==0)
                .collect(CollectorsDemo.toCollection(ArrayList::new));


    }
}
