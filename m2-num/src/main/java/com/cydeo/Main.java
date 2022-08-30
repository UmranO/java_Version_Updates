package com.cydeo;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");

        Currency c=Currency.DIME;  // DIME is an object of Currency Enum
                                   // we don't use new key word for object creation in Enum
        System.out.println(c);     /* when you print enum object you don't need to put
                                    toString because toString is already overriden */


        //How to access all the costants

        Currency[] currencies=Currency.values();  //values() where is it coming from?
        System.out.println(currencies);


    /*Enum can Not extend any class because it internally extends Enum Class
        that's where toString() is overriden and values() is coming from

    }
}
