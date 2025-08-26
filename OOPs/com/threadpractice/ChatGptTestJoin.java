package com.threadpractice;
class MyThread2 extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println(getName() + " finished.");
    }
}

public class ChatGptTestJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2();
        t1.start();

        t1.join(); // main thread waits for t1 to finish
        System.out.println("Main thread continues after t1 is done.");
    }
}
