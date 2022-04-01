package com.java.designpatterns.facade.bank;

public class Bank {
    public boolean hasSufficientSavings (Client client, int creditInquiryValue) {
        System.out.println("Checking savings for client: " + client.getName());
        return true;
    }
}