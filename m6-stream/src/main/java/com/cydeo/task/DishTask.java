package com.cydeo.task;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(p->p.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);


        //Print three high caloric dish name (>300)

        //Print all dish name that are below 400 calories in sorted

    }

}
