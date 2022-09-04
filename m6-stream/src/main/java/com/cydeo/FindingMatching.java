package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {


        //ALL MATCH

        System.out.println("-----------------------------------------------------------------");
        System.out.println("allMatch ()");
        boolean isHealthy=DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);

        //ANY MATCH
        System.out.println("-----------------------------------------------------------------");
        System.out.println("anyMatch ()");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegeterian friendly");
        }
        //NONE MATCH
        System.out.println("-----------------------------------------------------------------");
        System.out.println("noneMatch ()");
        boolean isHealthy2= DishData.getAll().stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //FIND ANY
        System.out.println("-----------------------------------------------------------------");
        System.out.println("findAny ()");
        Optional<Dish> dish=DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);
        System.out.println(dish.get());

        //FIND FIRST
        System.out.println("-----------------------------------------------------------------");
        System.out.println("findFirst ()");
        Optional<Dish> dish2=DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish);
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async)
        System.out.println("-----------------------------------------------------------------");
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst);
        System.out.println(findAny);

        DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        Optional dMin=DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin);
        System.out.println(dMin.get());

    }
}
