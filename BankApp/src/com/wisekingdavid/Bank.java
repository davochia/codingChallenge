package com.wisekingdavid;

import java.util.ArrayList;
import java.util.UUID;

public class Bank {

    private String name;
    private ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranch() {
        return branch;
    }


    public boolean listOfCustomerTransaction(String branchName, boolean customersTransaction){
        Branch branchExist = findBranch(branchName);

        if (branchExist != null){
            System.out.println("Branch customer information: " + branchExist.getBranchName());

            ArrayList<Customer> branchCustomers = branchExist.getCustomer();

            for (int i = 0; i < branchCustomers.size(); i++){
                System.out.println((i+1) + ".   " +
                        "Customer: " + branchCustomers.get(i).getName() );

                if (customersTransaction){
                    System.out.println( branchCustomers.get(i).getName() + "'s transactions: ");

                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();

                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println((j+1) + ". Amount: " + transactions.get(j));
                    }
                    System.out.println();
                }
            }
            return true;

        }
        return false;
    }


    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branch.size(); i++){
            if (this.branch.get(i).getBranchName().equals(branchName)){
                return this.branch.get(i);
            }
        }return null;
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branch.add(new Branch( branchName));
            return true;
        }
        return false;
    }


    public boolean newCustomer(String branchName, String customerName, int customerPhone, double firstDeposit){
        Branch branchExist = findBranch(branchName);
        if (branchExist != null){
            return branchExist.createNewCustomer(customerName, customerPhone, firstDeposit);
        }
        return false;
    }

    public boolean addNewTransaction(String branchName, String customerName, double amount){
        Branch branchExist = findBranch(branchName);
        if (branchExist != null){
            return branchExist.addTransaction(customerName, amount);
        }
        return false;
    }


}
