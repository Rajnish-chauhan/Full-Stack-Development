package com.exception.handling;

public class ExceptionHandling {
    public static void main(String[]args) {
        System.out.println("Hello");
        System.out.println("Raj");
        try {
            System.out.println(1 / 0);
        }
        catch (Exception e){
            System.out.println("Arithmetic Exception Occure need to solve it.");
        }
    }
}
