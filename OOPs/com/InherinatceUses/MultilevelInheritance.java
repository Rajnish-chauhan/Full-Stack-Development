package com.InherinatceUses;
class GrandFather{
   void  GrandFather(){
       // Agar class name se koi method banate ho aur method ka type void hai to wo constructor nhi hai agar uske age
       // koi bhi  type nhi h(exclude public) tb wo method constructor ki tarah treat hota h but aisa likna professional k liye sahi nhi h
       System.out.println("I'm Grand parent");
   }
}
class Father extends GrandFather {
   void Father (){
        System.out.println("I'm Father");
    }
}
class Son extends Father {
    void Son(){
        System.out.println("I'm Son");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
GrandFather g1=new GrandFather();
g1.GrandFather();
Father f1=new Father();
f1.Father();
Son s1=new Son();
s1.Son();
    }
}