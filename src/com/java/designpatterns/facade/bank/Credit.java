package com.java.designpatterns.facade.bank;

public class Credit {
    public boolean hasReliableCreditHistory (Client client) {
        System.out.println("Checking credit history for client: " + client.getName());
        return true;
    }
}