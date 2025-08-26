package com.exception.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class checked {

    public static void main(String[] args) {
        String path="Raj.txt";
        try (BufferedReader f1=new BufferedReader(new FileReader("Raj.txt"))){
            String File;
            while ((File=f1.readLine())!=null){
                System.out.println(File);
            }
        }
    catch (IOException e){
        System.out.println("FileNotFoundException occur");
        e.printStackTrace();
    }
    }

}
