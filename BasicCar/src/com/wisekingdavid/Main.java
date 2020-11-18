package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car Mercedes = new Car();

        porsche.setModel("Cayenne");
        System.out.println("Model: " + porsche.getModel());
    }
}
