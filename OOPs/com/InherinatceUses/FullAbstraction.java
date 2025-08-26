package com.InherinatceUses;
interface Vehicle{
    void speed();
    void Brand();
}
class car implements Vehicle{
    public void speed(){
        System.out.println("Car is Running");
    }
    public void Brand(){
        System.out.println("Brand is Toyota");
    }
}
public class FullAbstraction {
    public static void main(String[] args) {
        car c1 = new car();
        c1.speed();
        c1.Brand();
    }
}
