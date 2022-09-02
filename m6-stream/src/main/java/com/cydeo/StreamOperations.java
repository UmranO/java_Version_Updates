package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        list.forEach(System.out::println);

        //FILTER ()-------------------------------------------

        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        //DISTINCT ()-----------------------------------------

        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        //DISTINCT ()-----------------------------------------

        list.stream()
                .filter(i->i%2==0)
                .distinct()
                .forEach(System.out::println);

                // Alternative writing

        Stream<Integer> str=list.stream();

                str.filter(i->i%2==0)
                .distinct();

                str.forEach(System.out::println);







    }
}
