package com.polymorphism;
class Add{
    void Add1(int a,int b){
        System.out.println("Sum is:"+(a+b));
    }
    void Add1(int a,int b,int c){
        System.out.println("Sum is:"+(a+b+c));
    }
    void Add1(int a,int b,int c,int d){
        System.out.println("Sum is:"+(a+b+c+d+d));
    }
}
public class Overloading {             //it's also known as compile time polymorphism
    public static void main(String[] args) {
        Add add=new Add();
        add.Add1(2,3);
        add.Add1(4,5,6);
        add.Add1(8,3,9,10);
    }
}
