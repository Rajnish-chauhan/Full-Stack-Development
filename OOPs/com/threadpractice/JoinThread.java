package com.threadpractice;
class JThread extends Thread{
    @Override
    public void run() {
        System.out.println("Run");
    }
}
public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        JThread j = new JThread();
        j.start();

            j.join();

    }
}
