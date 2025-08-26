package com.InherinatceUses;
interface First{
    void MethodA();
//    default void Test(){
//        System.out.println("Test for the First");
//    }
}
interface Second{
    void MethodB();
//    default void Test(){
//        System.out.println("Test For method Second");
//    }
}
interface Third extends First,Second{
//    default void Test(){
//        System.out.println("Test for the Third");
//    }
}
class Four implements Third{
   public void MethodA(){
        System.out.println("Make For the Method A");
    }
  public  void MethodB(){
        System.out.println("Make For the B");
    }
}
public class HybridInterface {
    public static void main(String[] args) {

        Four f1=new Four();
        f1.MethodA();
        f1.MethodB();
    }
}
