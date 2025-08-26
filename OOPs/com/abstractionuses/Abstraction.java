package com.abstractionuses;

class Bird{
    String Name;
    String Breed;
    int Property;
    void sound(){
        System.out.println("Chew");
    }
}
class Dog extends Bird{

    void sound(){
        System.out.println("Bark");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Bird a1=new Bird();
        System.out.println("com.abstractionuses.Bird Sound is:");
        a1.sound();
        Bird d1=new Dog();
        System.out.println("com.abstractionuses.Dog Sound is:");
        d1.sound();
    }
}