package com.wisekingdavid;

import java.util.UUID;

public class Main {
    //private static UUID id = UUID.randomUUID();

    public static void main(String[] args) {

        Bank bank = new Bank("N26");
        bank.addBranch("Munich");

        bank.newCustomer("Munich","David", 40873, 100.50);
        bank.newCustomer("Munich", "Mike", 41705, 300.50);
        bank.newCustomer("Munich", "Silver", 40049, 1000);
        bank.newCustomer("Munich", "John", 122364, 200.90);

        bank.addBranch("Berlin");
        bank.newCustomer("Berlin", "Mathew", 4001049, 2000);
        bank.newCustomer("Berlin", "Jessica", 2122364, 500);

        bank.addNewTransaction("Munich", "David", 10000);
        bank.addNewTransaction("Berlin", "Jessica", 100);
        bank.addNewTransaction("Munich", "John", 1500);

        System.out.println(bank.listOfCustomerTransaction("Munich", true));

    }
}
