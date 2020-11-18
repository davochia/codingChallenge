package com.wisekingdavid;

class Car{
    private static String carName;
    private int numOfWheels;
    private boolean engine;
    private int numOfCylinder;
    private int numOfDoors;

    public Car(String carName, int numOfCylinder, int numOfDoors) {
        this.carName = carName;
        this.numOfWheels = 4;
        this.engine = true;
        this.numOfCylinder = numOfCylinder;
        this.numOfDoors = numOfDoors;
    }

    public static String getCarName() {
        return carName;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }


    public int getNumOfCylinder() {
        return numOfCylinder;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public String startEngine(){
        return "Engine starts";
    }

    public String accelerate(){
        return " accelerate";
    }

    public String brake(){
        return "Brake";
    }
}


class BMW extends Car{
    public BMW(String carName, int numOfCylinder, int numOfDoors) {
        super(carName, numOfCylinder, numOfDoors);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine Starts";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " brake!";
    }
}


class Mercedes extends Car{
    public Mercedes(String carName, int numOfCylinder, int numOfDoors) {
        super(carName, numOfCylinder, numOfDoors);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" engine Starts";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" brake";
    }
}


class Volvo extends Car{
    public Volvo(String carName, int numOfCylinder, int numOfDoors) {
        super(carName, numOfCylinder, numOfDoors);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" engine Starts";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" brake";
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            Car car = randomCar();
            System.out.println("Number # " + i + "\n" +
                    " : " + car.startEngine() +
                    " : " + car.accelerate() + "\n" +
                    " : " + car.brake());
        }

    }

    public static Car randomCar(){
        int rand = (int)(Math.random() * 3) + 1;

        switch (rand){
            case 1:
                return new BMW("BMW", 12, 5);


            case 2:
                return new Mercedes("Mercedes", 8, 3);


            case 3:
                return new Volvo("Volvo", 8, 5);

        }return null;
    }


}
