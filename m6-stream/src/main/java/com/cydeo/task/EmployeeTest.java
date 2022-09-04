package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all employee emails
        System.out.println("Print All Emails");
        EmployeeData.readAll()
                // .map(employee->employee.getEmpEmail())
                   .map(Employee::getEmpEmail)
                   .forEach(System.out::println);

        //Print all employee Phone #s---flatMap()

        System.out.println("Print All Phone Numbers with Lambda");

        EmployeeData.readAll()
                //.map(Employee::getEmpPhoneNumbers)
                .flatMap(employee->employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers with Double Colon");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

        }

    }

