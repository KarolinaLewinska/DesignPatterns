package com.java.designpatterns.facade.bank;

public class Loan {
    public boolean hasNotUnpaidLoans (Client client) {
        System.out.println("Checking loans history for " + client.getName());
        return true;
    }
}