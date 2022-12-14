package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("---------------toCollection(Supplier)-------------------");

        //toCollection(Supplier) : is used to create a Collection using Collector
        System.out.println("---------------ArrayList--------------");
        System.out.println();
        List<Integer>numberList=numbers.stream()
                .filter(p->p%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        System.out.println("---------------Set--------------");
        System.out.println();
        Set<Integer> numberSet=numbers.stream()
                .filter(p->p%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println("---------------List--------------");
        System.out.println();
        List<Integer> numberList2=numbers.stream()
                .filter(p->p%2==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("---------------Set--------------");
        System.out.println();
        Set<Integer> numberSet2=numbers.stream()
                .filter(p->p%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println("---------------Map--------------");
        System.out.println();
        Map<String,Integer> numberMap= DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(numberMap);

        System.out.println("-----------summingInt(ToIntFunction)----------");
        System.out.println();
        Integer sum=DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("-----------counting()----------");
        System.out.println();
        Long evenCount=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("-----------averagingInt()----------");
        System.out.println();
        Double calorieAverage=DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        System.out.println("-----------joining()----------");
        System.out.println();
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str=courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println("-----------partitioningBy()----------");
        System.out.println();
        Map<Boolean,List<Dish>> veggieDish=DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("-----------groupingBy()----------");
        System.out.println();
        Map<Type,List<Dish>> dishType=DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
    }
}
