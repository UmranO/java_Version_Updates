package com.cydeo.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import  static java.util.Comparator.comparing;
public class ComparingMethodPractice {
    public static void main(String[] args) {
        List<Dish> list=new ArrayList<>();
        Dish b=  new Dish("pork", false, 800, Type.MEAT);
        Dish c=  new Dish("beef", false, 700, Type.MEAT);
        Dish d=  new Dish("chicken", false, 400, Type.MEAT);
        list.add(b);
        list.add(c);
        list.add(d);

        System.out.println(list);

        System.out.println("**Ascending Name***************************************");
        list.sort(Comparator.comparing(Dish::getName));
           System.out.println(list);
        System.out.println("---Descending Name----");
        list.sort(comparing(Dish::getCalories).reversed());
           System.out.println(list);

        System.out.println("**Ascending Calories*************************************");
        list.sort(Comparator.comparing(Dish::getCalories));
           System.out.println(list);

        System.out.println("---Descending Calories----");
        list.sort(comparing(Dish::getCalories).reversed());
           System.out.println(list);
    }
}
