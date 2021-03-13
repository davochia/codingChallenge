package com.wisekingdavid;

public class PhoneNumber {
    private int phone;

    public PhoneNumber(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public static PhoneNumber createNumber(int number){
        return new PhoneNumber(number);
    }
}
