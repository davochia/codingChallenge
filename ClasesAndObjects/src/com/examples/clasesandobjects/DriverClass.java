package com.examples.clasesandobjects;

public class DriverClass {
    public static void main(String[] args) {
        House house = new House(12, 3, "Tiles","Brick");

        house.setNumOfDoors(4);
        System.out.println("House");
        System.out.println("Doors: " + house.getNumOfDoors() +"\n" +"Windows: " + house.getNumOfWindows());
    }
}
