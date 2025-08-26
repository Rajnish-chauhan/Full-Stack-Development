package com.threadpractice;
class YieldExa extends Thread{
    public YieldExa(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(getName()+"Running");
            Thread.yield();
        }
    }
}
public class YieldThread {
    public static void main(String[] args) {
        YieldExa ye=new YieldExa("Thread-1");
        YieldExa yE=new YieldExa("Thread-2");
        ye.start();
        yE.start();
    }
}
