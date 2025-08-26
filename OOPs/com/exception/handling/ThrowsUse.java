package com.exception.handling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsUse {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Raj.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File Don't exist");
        } catch (Exception e) {
            System.out.println("File Not Found");
        } finally {
            System.out.println("Run Successfully");
        }
    }
 static void fileRead() throws IOException {
            FileReader fileReader = new FileReader("Raj.txt");
            fileReader.read();
            fileReader.close();
        }
    }
