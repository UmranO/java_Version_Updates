package com.cydeo.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int empId;  //.stream  Stream<R>
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers; //.stream Stream<Stream<T>>

}