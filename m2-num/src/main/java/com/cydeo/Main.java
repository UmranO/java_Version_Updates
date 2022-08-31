package com.cydeo;

import java.util.Arrays;

import static com.cydeo.Operation.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");

        Currency c = Currency.DIME;  // DIME is an object of Currency Enum
        // we don't use new key word for object creation in Enum
        System.out.println(c);     /* when you print enum object you don't need to put
                                    toString because toString is already overriden */


        //How to access all the costants

        Currency[] currencies = Currency.values();  //values() where is it coming from?
        System.out.println(Arrays.toString(currencies));


    /*Enum can Not extend any class because it internally extends Enum Class
        that's where toString() is overriden and values() is coming from

        You can add variable, constructor, method in an Enum
        You can Not put abstract method/ can't make abstract the Enum because it is final
        You can not extend from final

*/
        System.out.println("How to use switch-case with enums");
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("It writes 4 times constructor because therea are 4 objects in the Operation Enum class");
                            // Constructor was executed for each object.

        Currency myCurrency = Currency.QUARTER;
        switch (myCurrency) {
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

        System.out.println("Operation Task");
        calculate(3, 5, Operation.PLUS);

        System.out.println("How top retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal());
    }
        private static void calculate(double x, double y,Operation operation){

            switch (operation) {
                case PLUS:
                    System.out.println(x + y);
                    break;
                case MINUS:
                    System.out.println(x - y);
                    break;
                case MULTIPLY:
                    System.out.println(x * y);
                    break;
                case DIVIDE:
                    System.out.println(x / y);
                    break;
            }

        }
}
