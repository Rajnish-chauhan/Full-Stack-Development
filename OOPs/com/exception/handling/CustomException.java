package com.exception.handling;

public class CustomException {
    public static void main(String[] args){
        try{
            Withdraw(500,1000);
        }catch(InsufficientFund e){
            System.out.println("Insufficient Fund"+e);
        }
    }
    public static void Withdraw(double Balance,double Amount) throws InsufficientFund {

        if(Amount>Balance){
            throw new InsufficientFund("Insufficient Fund:"+"Requested Amount:"+Amount+" Available Bal:"+Balance);
        }
    }
}
