package com.abstractionuses;

class Student {
    private String Name;
    private int Fee;
    private int age;

    public int getFee() {
        return Fee;
    }

    public void setFee(int fee) {
        Fee = fee;
        System.out.println("Fee set successful");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= -1 || age >= 101) {
            age = 0;
            System.out.println("Invalid age :" + age);
        } else {
            System.out.println("set age Successful");
        }
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
        System.out.println("Name set successful");
    }

}

public class Encapsulation {
    public static void main(String args[]){
Student s1=new Student();
s1.setFee(10000);
        System.out.println(s1.getFee());
s1.setAge(12);
        System.out.println(s1.getAge());
s1.setName("Ram");
        System.out.println(s1.getName());

    }
}
