package com.wisekingdavid;

import java.util.ArrayList;

public class PhoneBook {


    private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();


    public ArrayList<Contacts> getContactsList() {
        return contactsList;
    }

    // Add new contact information to list
    public void addContact(String name, int number){
        contactsList.add(new Contacts(name, number));
        System.out.println(name + " - " + number + " is added to contact list ");
    }

    // print contact list
    public void printContact(){
        String name = "";
        int number = 0;
        for(Contacts c : contactsList){
            name = c.getName();
            number = c.getNumber();
            System.out.println(name + " - " + number);
        }

        System.out.println("You have " + contactsList.size() + " contacts in your contact list");
    }

    // remove contact from list
    public void deleteContact(String name){
        int position = findContact(name);
        if(position >= 0){
            removeContact(position );
            System.out.println(name + " is deleted");
        }else{
            System.out.println(name + " not found");
        }
    }
    private void removeContact(int position){
        contactsList.remove(position);
    }


    // modify contact
    public void editContact(String nameToEdit, String newName, int newNumber){
        int position = findContact(nameToEdit);

        if (position >= 0){
            editContact(position, newName, newNumber);
            System.out.println(nameToEdit + " is edited");

        }else {
            System.out.println(nameToEdit + " is not in your contact list ");
        }
    }
    private void editContact(int position, String newName, int newNumber){
            contactsList.set(position, new Contacts(newName, newNumber));
    }


    public void searchContact(String name){
        int position = findContact(name);
        if(position >= 0 ){
            System.out.println(contactsList.get(position));
        }else {
            System.out.println(name + " Not found");
        }
    }

//    public void getContact(String name){
//        int position = findContact(name);
//        if(position >= 0){
//            System.out.println(contactsList.get(position));
//        }else{
//            System.out.println(name + " not found");
//        }
//    }

    public int findContact(String name){
        return contactsList.indexOf(name);
    }

}
