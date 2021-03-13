package com.wisekingdavid;

import java.util.ArrayList;
import java.util.List;

public class ContactList implements ISaveable{

    private String fullName;
    private int phone;
    private String address;

    public ContactList(String fullName, int phone, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "fullName='" + fullName + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.fullName);
        values.add(1, "" + this.phone);
        values.add(2, "" + this.address);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues !=null && savedValues.size() > 0){
            this.fullName = savedValues.get(0);
            this.phone = Integer.parseInt(savedValues.get(1));
            this.address = savedValues.get(2);
        }
    }
}
