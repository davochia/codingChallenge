package com.wisekingdavid;

public class VipPerson {
    private String name, emailAddress;
    private double creditLimit;

    public VipPerson(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }
    public VipPerson() {
        this("Default name", "Default email", 100);
    }

    public VipPerson(String name, String emailAddress) {
        this(name, emailAddress, 200);
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
