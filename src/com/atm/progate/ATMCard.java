package com.atm.progate;

public class ATMCard {
    int defaultPin;
    int defaultBalance;

    public ATMCard(int defaultPin, int defaultBalance) {
        this.defaultPin = defaultPin;
        this.defaultBalance = defaultBalance;
    }

    int pinAwal() {
        return this.defaultPin;
    }

    int saldoAwal() {
        return this.defaultBalance;
    }
}
