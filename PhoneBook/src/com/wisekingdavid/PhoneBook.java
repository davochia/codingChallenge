package com.wisekingdavid;

import java.util.ArrayList;


public class PhoneBook {

    private String addList;
    ArrayList<Contact> contact;

    public PhoneBook(String addList) {
        this.addList = addList;
        this.contact = new ArrayList<Contact>();
    }

    // Print list of contact
    public void printContact(){
        System.out.println("Contacts: ");
        for (int i = 0; i < this.contact.size(); i++){
            System.out.println((i + 1) + ". Name: " + this.contact.get(i).getFullName() +
                    " -> Phone: " + this.contact.get(i).getPhoneNumber());
        }
    }

    // Add unique contact name and number to list
    public boolean addContactList(Contact contact){
        int posNum = numToSearch(contact.getPhoneNumber());
        int posName = searchContact(contact.getFullName());

        //Contact nameExist = queryContactList(contact.getFullName());
        //Contact numExist = numToSearch(contact.getPhoneNumber());

        if (posNum < 0) {
            if (posName < 0){
                this.contact.add(contact);
                System.out.println(contact.getFullName() + " -> " + contact.getPhoneNumber() + " was added to phone book");
                return true;
            }
            else {

                System.out.println(contact.getFullName() + " not added, contact with same name already exist with name: "
                        + queryContactList(contact.getFullName()).getFullName() + " -> " + queryContactList(contact.getFullName()).getPhoneNumber());
                return false;
            }
        }

        System.out.println(contact.getFullName() + " not added, contact  with same number or name already exist with name: "
                + queryByNumber(contact.getPhoneNumber()).getFullName()  + " -> "+ queryByNumber(contact.getPhoneNumber()).getPhoneNumber());
        return false;
    }


    // delete contact by name if available
    public void deleteContactList(Contact contact){
        int position = searchContact(contact);
        if (position >= 0){
            this.contact.remove(position);
        }
    }

    // Edit contact if available, new name and number must be unique
    public boolean editContactList(Contact oldContact, Contact newContact){

        int position = searchContact(oldContact);
        Contact sameContact = queryByNumber(newContact.getPhoneNumber());

        if (position < 0){

            System.out.println(oldContact.getFullName() + " not found");
            return false;


        }
        else if (numToSearch(newContact.getPhoneNumber()) >= 0){

            System.out.println("Contact with same number or name already exist... " +
                    sameContact.getFullName() + " -> "+ sameContact.getPhoneNumber());
            return false;
        }

        System.out.println(oldContact.getFullName() + " is available");
        this.contact.set(position, newContact);
        return true;

    }

    private int searchContact(int numberToSearch){
        for (int i = 0; i < this.contact.size(); i++){
            Contact searchContact = this.contact.get(i);
            if (searchContact.getPhoneNumber() == (numberToSearch)){
                return i;
            }
        }
        return -1;
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

    public Contact queryContactList(String name){
        int position = searchContact(name);
        if (position >= 0) {
            return this.contact.get(position);
        }return null;
    }

    public Contact queryByNumber(int num){
        int position = searchContact(num);
        if (position >= 0) {
            return this.contact.get(position);
        }return null;
    }

    private int numToSearch(int numToSearch){
        for (int i = 0; i < this.contact.size(); i++){
            Contact searchContact = this.contact.get(i);
            if (searchContact.getPhoneNumber() == numToSearch){
                return i;
            }
        }
        return -1;
    }

    public String queryContactList(Contact contact){
        if (searchContact(contact) >= 0) {
            return contact.getFullName();
        }return null;
    }

//  private PhoneNumber addExtraNumber(int number) {
//            System.out.println("Do want to add new number? press 'y' for yes, 'n' to cancel");
//            String choice = sc.nextLine();
//            if (choice.equals("y")){
//                 return true;
//            }
//    }

//    public static void mergeContact(){
//
//    }
}
