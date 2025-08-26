package com.polymorphism;
class Hello{
    void SayHello(){
        System.out.println("Hello sir");
    }
}
class Namastey extends Hello{
    void SayHello(){
        System.out.println("Namastey Sir");
    }
}
public class Override {                  //   it's also known as Run time com.polymorphismusages.Polymorphism
    public static void main(String[] args) {
        Hello h1=new Namastey();
        h1.SayHello();

    }
}
