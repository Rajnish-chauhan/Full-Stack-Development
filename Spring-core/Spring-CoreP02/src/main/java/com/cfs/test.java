package com.cfs;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        System.out.println("----------BeanFactory Started-----------");
//        BeanFactory factory=new ClassPathXmlApplicationContext("Beans.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("-------Bean File Loaded------");

        System.out.println("Sending Request...");
        System.out.println("------------First Call--------------");
        Car car1=context.getBean(Car.class);
        car1.drive();
        }
    }
