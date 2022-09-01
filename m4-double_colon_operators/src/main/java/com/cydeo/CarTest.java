package com.cydeo;

import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero Argument Constructor
        Supplier <Car> c1= ()-> new Car();
        System.out.println(c1.get().getModel());


    }

}
