package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());

        person.setFirstName("John");
        //person.setLastName("");
        person.setAge(18);
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());

        //person.setFirstName("");
        person.setLastName("Smith");
        //person.setAge(10);
        System.out.println("Full Name = " + person.getFullName());
        //System.out.println("Teen = " + person.isTeen());

    }
}
