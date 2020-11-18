package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(30, 70, 6);
        Case theCase = new Case("330B", "HP", "220", dimensions);
        Monitor theMonitor = new Monitor("42inch Ultra", "Dell", 42, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("fj-200", "Intel", "v2.44", 6, 4);

        PC thPC = new PC(theCase, theMonitor, theMotherboard);
        thPC.powerUp();

    }
}
