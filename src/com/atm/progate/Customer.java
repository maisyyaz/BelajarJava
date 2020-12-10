package com.atm.progate;

public class Customer {
    ATMCard atmCard = new ATMCard(1234, 10000);

    int id;
    int custPin;
    int custBalance;

    public Customer(int id) {
        this.id = id;
        this.custPin = atmCard.defaultPin;
        this.custBalance = atmCard.defaultBalance;
    }

    int cekId() {
        return this.id;
    }

    int cekPin() {
        return this.custPin;
    }

    int cekSaldo() {
        return this.custBalance;
    }

    void debet(int nominal) {
        this.custBalance -= nominal;
    }

    void deposit(int nominal) {
        this.custBalance += nominal;
    }
}
