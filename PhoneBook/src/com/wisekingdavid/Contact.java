package com.wisekingdavid;

import java.util.ArrayList;

public class Contact {
    private String fullName;
    private int phoneNumber;

    //private ArrayList<Integer> phoneNumber;

    public Contact(String fullName, int phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber; //new ArrayList<Integer>();
        //addPhoneNumber(phoneNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createNewContact(String name, int phone){

        return new Contact(name, phone);
    }



    /**    public ArrayList<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    private void  addPhoneNumber(int  phoneNumber){
        this.phoneNumber.add(phoneNumber);
    }
 */

}
