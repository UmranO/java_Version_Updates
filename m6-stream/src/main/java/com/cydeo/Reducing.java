package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.cydeo.task.DishData.getAll;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

//        int sum = 0;
//        for(int number : numbers){
//            sum = sum + number;
//        }

        int sum=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        Optional<Integer> calorieTotal=DishData.getAll().stream()
                .map(Dish::getCalories)
               .reduce((a,b)->a+b);  //If we leave it like this it will return optional
        System.out.println(calorieTotal);

        Integer calorieSum=DishData.getAll().stream()
                .map(Dish::getCalories).reduce((a,b)->a+b)
                        .get();
        System.out.println(calorieSum);

        System.out.println("------MAX & MIN & SUM-------------------------- ");
        System.out.println();
        Optional<Integer> max=numbers.stream().reduce(Integer::max);
        System.out.println("Max: "+ max);
        Optional<Integer> min=numbers.stream().reduce(Integer::min);
        System.out.println("Min: "+min );
        Optional<Integer> sum1 =numbers.stream().reduce(Integer::sum);
        System.out.println("Sum: "+ sum1);

    }
}
