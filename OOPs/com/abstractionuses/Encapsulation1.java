package com.abstractionuses;

class BankSys{
    private int CustomerId;
    private String Name;
    private int AccountNo;
    private int Balance;
    private int  withdraw;
    private int Deposit;
    public int getId(){
        return CustomerId;
    }
    public void setId(int customerId){
        if (customerId<=0){
            customerId=0;
            System.out.println("Invalid Id (please give me a valid id) ");
        }
        else {
            System.out.println("Id set Successful");
        }
        this.CustomerId=customerId;
    }

    public int getBalance() {

        return Balance;
    }

    public void setBalance(int balance) {
        if(balance<=0){
            System.out.println("Invalid or insufficient Amount");
        }
        else {
            System.out.println("Balance set Successful");
        }
        Balance = balance;
    }

    public int getAccountNo(){
        return AccountNo;
    }
    public void setAcountNo(int AccountNo){
        if (AccountNo<=0){
            System.out.println("Invalid Account No(please enter valid Account)");
        }
        else{
        System.out.println("Account set Successful");
        this.AccountNo=AccountNo;}

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        if (withdraw<=0||withdraw>=Balance){
            System.out.println("Insufficient Amount");
        }
        else {
             Balance-=withdraw;
            System.out.println("Withdraw successful");
        }
        this.withdraw = withdraw;
    }

    public int getDeposit() {
        return Deposit;
    }

    public void setDeposit(int deposit) {
        if(Balance<=0){
            System.out.println("insufficient Amount");
        }
        else{
            Balance+=deposit;
            System.out.println("Deposit Successful ");
        }
        this.Deposit = deposit;
    }

}
public class Encapsulation1{
    public static void main(String args[]){
        BankSys s1=new BankSys();
        s1.setId(23765935);
        System.out.println("Customer Id is"+s1.getId());
        s1.setAcountNo(1445194070);
        System.out.println(s1.getAccountNo());
        s1.setBalance(2469);
        System.out.println(s1.getBalance());
        s1.setDeposit(1000);
        System.out.println(s1.getDeposit());
        s1.setDeposit(1200);
        System.out.println(s1.getDeposit());
        s1.setWithdraw(123);
        System.out.println(s1.getWithdraw());
        System.out.println(s1.getBalance());
    }
}

