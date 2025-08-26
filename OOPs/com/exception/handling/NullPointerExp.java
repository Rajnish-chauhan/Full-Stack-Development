package com.exception.handling;
public class NullPointerExp {
    public static void main(String[] args) {
        String NullPointer = null;
        try {
            System.out.println(NullPointer.length());
        }catch (NullPointerException e){
            System.out.println("Length Not Found"+e);
        }
        }
    }
