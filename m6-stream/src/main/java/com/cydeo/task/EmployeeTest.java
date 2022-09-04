package com.cydeo.task;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all employee emails
        System.out.println("Print All Emails");
        EmployeeData.readAll()
                // .map(employee->employee.getEmpEmail())
                   .map(Employee::getEmpEmail)
                   .forEach(System.out::println);

    }
}
