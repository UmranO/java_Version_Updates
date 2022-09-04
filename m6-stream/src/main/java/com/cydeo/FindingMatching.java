package com.cydeo;

import com.cydeo.task.DishData;

public class FindingMatching {
    public static void main(String[] args) {


//ALL MATCH
        System.out.println("allMatch ()");
        boolean isHealthy=DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);

    }
}
