package com.java.designpatterns.facade.bank;

public class Mortgage {
    private Bank bank = new Bank();
    private Loan loan = new Loan();
    private Credit credit = new Credit();

    public boolean ifIsQualifiedForMortgage(Client client, int creditInquiryValue) {
        System.out.println("Client: " + client.getName() + " sent a request for a mortgage worth " + creditInquiryValue);
        boolean isQualifiedForMortgage = true;

        if (!bank.hasSufficientSavings(client, creditInquiryValue)) {
            isQualifiedForMortgage = false;
        } else if (!loan.hasNotUnpaidLoans(client)) {
            isQualifiedForMortgage = false;
        } else if (!credit.hasReliableCreditHistory(client)) {
            isQualifiedForMortgage = false;
        }
        return isQualifiedForMortgage;
    }
}