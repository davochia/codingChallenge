package com.wisekingdavid;

public class Account {

    private double balance;
    private String firstName, lastName,accountNumber, customerPhone, customerEmail;

    public Account(String firstName, String lastName, String accountNumber, double balance,
                   String  customerEmail, String customerPhone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public Account(){
        this("First Name", "Second Name", "1100000000", 100,
                "username@example.com", "+301234567890");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Return account name
    public String getFullName(){
        if (this.lastName.isEmpty() && this.firstName.isEmpty()){
            return "";
        }else if (this.lastName.isEmpty()){
            return this.firstName;
        }else if (this.firstName.isEmpty()){
            return this.lastName;
        }else return this.firstName + " " + this.lastName;
    }

    // Make deposit
    public void deposit(double amount){
        System.out.println("---Deposit---");

        this.balance += amount;

        System.out.println("Account Name: " + getFullName());
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("You have added $" + amount + " to account ");
        System.out.println("New balance: $" + this.balance);
    }

    // Make withdrawal
    // check if theres enough amount to withdraw
    public void withdraw(double amount){
        System.out.println("---Withdraw---");

        if (this.balance - amount < 0){
            System.out.println("Account Name: " + getFullName() );
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Insufficient funds: $" + this.balance);
        }else {
            this.balance -= amount;

            System.out.println("Account Name: " + getFullName() );
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("You have withdraw $" + amount + " from account");
            System.out.println("New balance: $" + this.balance);
        }
    }
}
