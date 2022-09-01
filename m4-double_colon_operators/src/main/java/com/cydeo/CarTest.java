package com.cydeo;

import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero Argument Constructor
        Supplier <Car> c1= ()-> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2= Car::new;
        System.out.println(c2.get().getModel());

        //One Argument Constructor

        Function <Integer,Car> func= model-> new Car(model);
        Function <Integer,Car> func1=Car::new;
    }

}
