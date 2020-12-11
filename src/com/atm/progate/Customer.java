package com.atm.progate;

public class Customer {
    ATMCard atmCard = new ATMCard(1111, 100000);

    int id;
    public int custPin;
    int custBalance;

    public Customer(int id) {
        this.id = id;
        this.custPin = atmCard.defaultPin;
        this.custBalance = atmCard.defaultBalance;
    }

    int cekId() {
        return this.id;
    }

    public int cekPin() {
        return this.custPin;
    }

    public int cekSaldo() {
        return this.custBalance;
    }

    public void debet(int nominal) {
        this.custBalance -= nominal;
    }

    public void deposit(int nominal) {
        this.custBalance += nominal;
    }
}
