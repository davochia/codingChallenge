package com.wisekingdavid;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int phone;

    ArrayList<Double> transactions;


    public Customer(String name, int phone, double firstDeposit) {
        this.name = name;
        this.phone = phone;
        this.transactions = new ArrayList<Double>();
        addTransaction(firstDeposit);
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double firstDeposit){
        this.transactions.add(firstDeposit);
    }
}
