package com.wisekingdavid;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactList jamesBond = new ContactList("James Bond", 1209384, "london 324");
        System.out.println(jamesBond.toString());
        saveObjects(jamesBond);

        jamesBond.setAddress("City Hall, Essex");
        System.out.println(jamesBond);
        saveObjects(jamesBond);
        System.out.println(jamesBond);

        loadObjects(jamesBond);
        System.out.println(jamesBond);

    }

    public static ArrayList<String> takeValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int pos = 0;
        printMenu();

        while(!quit){
            System.out.println("Make a choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter string: ");
                    String stringInput = sc.nextLine();
                    values.add(pos, stringInput);
                    break;
            }
        }
        return values;
    }

    private static void printMenu() {
        System.out.println("Enter choice \n" +
                "#1 to enter string value \n" +
                "#0 to quit program.");
    }



    public static void saveObjects(ISaveable objectToSave){
        for (int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }


    public static void loadObjects(ISaveable objectToSave){
        ArrayList<String> values = takeValues();
        objectToSave.read(values);
    }
}
