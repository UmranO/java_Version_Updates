package com.cydeo;

public class Main {
    public static void main(String[] args) {

        Calculate sum = (x,y) -> System.out.println(x+y);

        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        //Reference to a Static Method
        Calculate s2=Calculator::findSum;

        s2.calculate(10,20);

        //Reference to an instance method
        Calculator obj =new Calculator();
        Calculate s3= obj::findMultiply;

        //OR
        Calculate s4=new Calculator() :: findMultiply;



    }
}
