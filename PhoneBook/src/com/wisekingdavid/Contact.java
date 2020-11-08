package com.wisekingdavid;

public class Contact {
    private String fullName;
    private int phoneNumber;

    public Contact(String fullName, int phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createNewContact(String name, int phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
