package com.threadpractice;
class Wait extends Thread{
    int Total=0;

    @Override
    public void run() {
synchronized (this) {
    System.out.println("Child Thread Start calculating:");
    for (int i = 1; i <= 100; i++) {
        Total = Total + i;
    }
   this.notify();
    System.out.println("Child giving Notification");
}
    }
}
public class WaitUseInThread {
    public static void main(String[] args) throws InterruptedException{
        Wait w1=new Wait();
        w1.start();
        System.out.println("Running Main Method");
        synchronized (w1){
            System.out.println("Main Thread calling Wait");
            w1.wait();
            System.out.println("Main Thread get Notify");
            System.out.println("Total is:"+w1.Total);
        }
    }
}
