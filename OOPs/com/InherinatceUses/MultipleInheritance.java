package com.InherinatceUses;
interface Car{
    int age =19;
    float Age=20;
//    void speed();
    default void hello(){
        System.out.println("Hello");
        Namastey();
    }
    private void Namastey(){
        System.out.println("Namastey sir");
    }
}
interface Bike{
//    void Brand();
static void Hii(){
    System.out.println("Hii sir");
}
}

class Test implements Bike,Car{
//    public void speed(){
//        System.out.println("Car is Accelerating");
//    }
//    public void Brand(){
//        System.out.println("Bike Brand is : Hero");
//    }
}
public class MultipleInheritance {
public static void main(String[]args){
    Test t1=new Test();
    t1.hello();
    Bike.Hii();
//    t1.speed();
}
}
