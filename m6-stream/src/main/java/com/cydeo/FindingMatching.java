package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Optional;

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

    }
}
