package com.InherinatceUses;

import org.w3c.dom.ls.LSOutput;

class Phone{
    public Phone(){
        System.out.println("Constructor called");
    }
    int ModelNo;
    String Feature;
    void Call(){
        System.out.println("Calling");
    }
}
class MusicPlayer extends Phone{
    void Call(){
        System.out.println("Music Playing");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.Call();
        MusicPlayer m1=new MusicPlayer();
        m1.Call();
    }
}
