package com.exception.handling;

public class InsufficientFund extends Exception {
   public InsufficientFund(String Message){
       super(Message);
   }
}
