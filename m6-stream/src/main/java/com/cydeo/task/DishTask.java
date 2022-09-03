package com.cydeo.task;

import javax.lang.model.element.Name;
import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //1-Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(p->p.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("********************************************************");

        //2-Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("********************************************************");

        //3-Print three high caloric dish name (>300)

        DishData.getAll().stream()
             .filter(dish -> dish.getCalories()>300)
              .map(Dish::getName)
               .limit(3)
                .forEach(System.out::println);


        System.out.println("********************************************************");

        //4-Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(p->p.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(p->p.getName())
                .forEach(System.out::println);

    }

}
