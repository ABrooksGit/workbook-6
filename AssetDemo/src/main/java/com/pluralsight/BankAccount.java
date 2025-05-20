package com.pluralsight;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdrawals(double amount){
        balance -= amount;

    }

    public void deposit(double amount){

        balance += amount;
    }

    public  double getValue(){

        return balance;
    }


}
