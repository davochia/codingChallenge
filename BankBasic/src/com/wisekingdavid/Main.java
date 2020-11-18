package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {
        Account saving = new Account();  //("John", "Smith", "100098084", 50, "johnsmith@example.com","+301234567890");
        System.out.println(saving.getCustomerEmail());

        Account savings1 = new Account();
        savings1.deposit(360);
        savings1.deposit(1000);
        System.out.println();
        //savings.withdraw(2000);
        System.out.println(savings1.getBalance());

        System.out.println("------------------------------------------");

        savings1.withdraw(1460);
        System.out.println(savings1.getBalance());

        System.out.println("------------------------------------------");



        VipPerson vip = new VipPerson("Mike", "username@example.com");
        System.out.println(vip.getCreditLimit());

        System.out.println("------------------------------------------");

        VipPerson vip2 = new VipPerson();
        System.out.println(vip2.getEmailAddress());

        System.out.println("------------------------------------------");

        VipPerson vip3 = new VipPerson("Jack", "jack@fakename.com", 10000);
        System.out.println(vip3.getName());

    }
}
