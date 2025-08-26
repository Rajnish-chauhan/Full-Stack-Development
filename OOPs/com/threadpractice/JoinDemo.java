package com.threadpractice;
class Test extends Thread{
    @Override
    public void run() {

        for (int i=1;i<=10;i++){
            System.out.println("Test Override run");
            Thread.yield();

        }
    }
}
class Test1 extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("I'm Test1 in overrided run");
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        Thread t= Thread.currentThread();
//        System.out.println(Thread.currentThread().getName());
        t.setName("New Thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(t.isAlive());
        Test t1=new Test();
        t1.setName("Child-Thread");
        Test1 t2=new Test1();
        System.out.println(t1.getName());
        t1.start();
        t2.start();
    }
}
