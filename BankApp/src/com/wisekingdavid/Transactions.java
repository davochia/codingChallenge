package com.wisekingdavid;

public class Transactions {

    private double balance;

    public Transactions(){
        this(100);
    }

    public Transactions(double balance) {
        this.balance = balance;
    }

    private double getBalance() {
        return balance;
    }

    private void makeDeposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + " is deposited to your account. New balance: " + this.balance);
        }
        else {
            System.out.println("Insufficient amount to perform this transaction");
        }

    }

    private void makeWithdrawal(double amount){
        if (balance >= amount && amount > 0){
            balance -= amount;
            System.out.println(amount + " is withdraw from your account. New balance: " + this.balance);
        }
        else {
            System.out.println("Insufficient funds in account to perform this transaction");
        }
    }
}
