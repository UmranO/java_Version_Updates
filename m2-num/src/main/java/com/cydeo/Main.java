package com.cydeo;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");

        Currency c=Currency.DIME;  // DIME is an object of Currency Enum
        System.out.println(c);     /* when you print enum object you don't need to put
                                    toString because toString is already overriden */


        //How to access all the costants

        Currency[] currencies=Currency.values();  //values() it is also overridden
        System.out.println(currencies);

    }
}
