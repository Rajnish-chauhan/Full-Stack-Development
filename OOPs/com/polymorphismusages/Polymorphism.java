package com.polymorphismusages;

public class Polymorphism {
    public static void main(String []args){
        Sum sum=new Sum();
int Sum=sum.Add(10,20);
        System.out.println(Sum);
    }
}
class Sum{
 int Add(int a,int b){
        return a+b;
    }
    int  Add(int  a,int  b,int c){
     return a+b+c;
    }
    int  Add(int  a, int  b,int c,int d){
     return a+b+c+d;
    }
}
