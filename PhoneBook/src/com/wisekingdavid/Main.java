package com.wisekingdavid;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static PhoneBook phoneBook = new PhoneBook("Phone numbers: ");

    public static void main(String[] args) {
        System.out.println("Starting phonebook application...");

        boolean flag = true;
        int option = 0;

        printOptions();

        while (flag){

            System.out.print("Enter option from list: \n" );
            option = sc.nextShort();
            sc.nextLine();

            switch (option){
                case 0:
                    printOptions();
                    break;

                case 1:
                    printContactList();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    deleteContact();
                    break;

                case 4:
                    editContact();
                    break;


                case 5:
                    searchContact();
                    break;


                case 6:
                    mergeContact();
                    break;

                case 7:
                    flag = false;
                    break;
            }
        }
    }

    private static void printContactList(){
        phoneBook.printContact();
    }

    private static void addNewContact() {
        System.out.println("Enter full name: ");
        String name = sc.nextLine();

        System.out.println("Enter phone number: ");
        int phoneNumber = sc.nextInt();

        Contact newContact = Contact.createNewContact(name, phoneNumber);
        phoneBook.addContactList(newContact);
    }

    private static void deleteContact() {
        System.out.println("Enter name to delete: ");
        String nameToDelete = sc.nextLine();

        Contact contactFound = phoneBook.queryContactList(nameToDelete);
        if (contactFound == null){
            System.out.println(nameToDelete + " not found");
            return;
        }
        else {
            phoneBook.deleteContactList(contactFound);
            System.out.println(nameToDelete + " deleted");

        }

    }

    private static void editContact() {
        System.out.println("Enter name to edit: ");
        String nameToEdit = sc.nextLine();

        Contact contactFound = phoneBook.queryContactList(nameToEdit);

        if (contactFound == null){
            System.out.println(nameToEdit + " not found");
            return;
        }

        System.out.println("Enter new full name: ");
        String newName = sc.nextLine();

        System.out.println("Enter new phone number: ");
        int newPhoneNumber = sc.nextInt();

        Contact newContact = Contact.createNewContact(newName, newPhoneNumber);

        if (phoneBook.editContactList(contactFound, newContact)){
            System.out.println(nameToEdit + " updated successfully. New Name: " + newName + " Phone: " + newPhoneNumber);
        }else {
            System.out.println("Error encountered");
        }

    }

    private static void searchContact() {
        System.out.println("Enter name to search: ");
        String nameToSearch = sc.nextLine();

        Contact contactFound = phoneBook.queryContactList(nameToSearch);
        if (contactFound == null){
            System.out.println(nameToSearch + " not found");
            return;
        }
        System.out.println(nameToSearch + " is available");
        System.out.println("Name: " + contactFound.getFullName() + ", with Phone number: " + contactFound.getPhoneNumber());
    }

    private static void mergeContact() {
        System.out.println("coming soon...");
    }

    private static void printOptions() {
        System.out.println("Enter #0 to print option...");
        System.out.println("Enter #1 to print contacts...");
        System.out.println("Enter #2 to add contacts...");
        System.out.println("Enter #3 to delete contact...");
        System.out.println("Enter #4 to edit contact...");
        System.out.println("Enter #5 to search contact...");
        System.out.println("Enter #6 to merge contact...");
        System.out.println("Enter #7 to quit application...");
        System.out.println();
    }
}
