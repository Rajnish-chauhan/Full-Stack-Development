package com.threadpractice;
class Mythread1 extends Thread{
    public void run(){
        System.out.println("Running");
    }
}
public class SetPriority {
    public static void main(String[] args) {

        Mythread1 t1=new Mythread1();

        Mythread1 t2=new Mythread1();

        Mythread1 t3=new Mythread1();

      /*  t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());

        t2.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t2.getPriority());

        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t3.getPriority());*/

        t1.setPriority(9);
        System.out.println(t1.getPriority());
    }
}
