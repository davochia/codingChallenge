package com.wisekingdavid;

import java.util.ArrayList;
import java.util.UUID;

public class Branch {

    //private UUID id;
    private String branchName;
    private ArrayList<Customer> customer;

    public Branch(String branchName) {

        this.branchName = branchName;
        this.customer = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    private Customer customerExist(String customerName) {
        for (Customer customer : this.customer) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean createNewCustomer(String customerName, int customerPhone, double firstDeposit){
        if (customerExist(customerName) == null){
            this.customer.add(new Customer(customerName, customerPhone, firstDeposit));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount){
        Customer currentCustomer = customerExist(customerName);
        if (currentCustomer != null){
            currentCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }


}
