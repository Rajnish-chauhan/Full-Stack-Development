package com.InherinatceUses;
class GrandFather1{
   void GrandP(){
        System.out.println("I'm Grand Parent");
    }
}
class Father1 extends GrandFather1{
    @Override
    void GrandP() {
        System.out.println("I'm Father");
    }
}
class Son1 extends GrandFather1{
    @Override
    void GrandP() {
        System.out.println("I'm Son");
    }
}
public class HierarchicalInterface {
    public static void main(String[] args) {
        GrandFather1 g1=new GrandFather1();
        g1.GrandP();
        Father1 f1=new Father1();
        f1.GrandP();
        Son1 s1=new Son1();
        s1.GrandP();
    }
}
