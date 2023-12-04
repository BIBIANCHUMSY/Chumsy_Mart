package org.chumsy.Entities;

public class Customer extends Human {

    private double wallet;

    public Customer(String name, String id, String email, String phoneNumber) {
        super(name, id, email, phoneNumber);
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public Customer(String name, String id, String email, String phoneNumber, double wallet) {
        super(name, id, email, phoneNumber);
        this.wallet = wallet;
    }
}