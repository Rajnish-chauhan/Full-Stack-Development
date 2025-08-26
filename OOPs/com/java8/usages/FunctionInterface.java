package com.java8.usages;
//interface Employee{
//    String getEmp();
//}
public class FunctionInterface {
    public static void main(String[] args) {
        Employee employee=()->"Software Engineer";
        System.out.println(employee.getEmp());
    }
}
