package com.threadpractice;
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable");
    }
}
public class ThreadPra {
    public static void main(String[] args) {
Thread t =new Thread(new MyThread());
//        MyThread t=new MyThread();
        t.start();

    }
}
