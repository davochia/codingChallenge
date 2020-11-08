package com.wisekingdavid;

import java.util.ArrayList;


public class PhoneBook {

    private String addList;
    ArrayList<Contact> contact;

    public PhoneBook(String addList) {
        this.addList = addList;
        this.contact = new ArrayList<Contact>();
    }

    public void printContact(){
        for (int i = 0; i < this.contact.size(); i++){

            System.out.println((i + 1) + ". Name: " + this.contact.get(i).getFullName() +
                    " -> Phone: " + this.contact.get(i).getPhoneNumber());

        }
    }

    public boolean addContactList(Contact contact){
        if (searchContact(contact.getFullName()) >= 0) {
            System.out.println(contact.getFullName() + " not added, contact already exist");

//            System.out.println("Do want to add new number? press 'y' for yes, 'n' to cancel");

//            String choice = sc.nextLine();
//            if (choice.equals("y")){
//
//
//                 addExtraNumber();
//                 return true;
//            }
            return false;
        }
        this.contact.add(contact);


        System.out.println(contact.getFullName() + " -> " + contact.getPhoneNumber() + " was added to phone book");
        return true;
    }

//    private PhoneNumber addExtraNumber(int number) {
//
//
//    }

    public void deleteContactList(Contact contact){
        int position = searchContact(contact);
        if (position >= 0){
            this.contact.remove(position);
        }
    }

    public boolean editContactList(Contact oldContact, Contact newContact){
        int position = searchContact(oldContact);
        if (position >= 0){
            System.out.println(oldContact.getFullName() + " is available");
            this.contact.set(position, newContact);
            return true;
        }

        System.out.println(oldContact.getFullName() + " not found");
        return false;
    }

    private int searchContact(String nameToSearch){
        for (int i = 0; i < this.contact.size(); i++){
            Contact searchContact = this.contact.get(i);
            if (searchContact.getFullName().equals(nameToSearch)){
                return i;
            }
        }
        return -1;
    }
    private int searchContact(Contact contact){
        return this.contact.indexOf(contact);
    }

    public String queryContactList(Contact contact){
        if (searchContact(contact) >= 0) {
            return contact.getFullName();
        }return null;
    }

    public Contact queryContactList(String name){
        int position = searchContact(name);
        if (position >= 0) {
            return this.contact.get(position);
        }return null;
    }

//    public static void mergeContact(){
//
//    }
}
