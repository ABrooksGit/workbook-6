package com.pluralsight;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Portfolio p = new Portfolio("Hunter's Portfolio", "Kelly");
        BankAccount bankAccount = new BankAccount("Kelly", "23123132", 107);
        CreditCard creditCard1 = new CreditCard("Kelly", "1948373", 880);
        creditCard1.charge(10);
         p.add(bankAccount);
         p.add(creditCard1);
         p.add(new Jewelry("Necklace", 4));
         p.add(new House(2002, 11, 3));
         p.add(new Gold(1));
        System.out.println("The total value of this portfolio is : " + p.getValue());
    }









}