package com.abstractionuses;

abstract class Car{
    abstract void Accelerate();
    abstract void Deaccelerate();
    void Hello(){
        System.out.println("Hello");
    }
    String BrandName;
}
class Bike extends Car{

    void Accelerate(){
        System.out.println("Accelerating");
    }

    void Deaccelerate(){
        System.out.println("Deaccelerating");
    }
}


public class AbsTest {
    public static void main(String[]args){
        Bike b1=new Bike();
        b1.Accelerate();
        b1.Deaccelerate();
        b1.Hello();
    }
}
