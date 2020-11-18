package com.examples.clasesandobjects;

public class House {
    private int numOfWindows;
    private int numOfDoors;
    private String roofType;
    private String wallType;

    public House(){
        numOfWindows = 0;
        numOfDoors = 0;
        roofType = null;
        wallType = null;
    }

    public House(int numOfWindows, int numOfDoors, String roofType, String wallType) {
        this.numOfWindows = numOfWindows;
        this.numOfDoors = numOfDoors;
        this.roofType = roofType;
        this.wallType = wallType;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public String getRoofType() {
        return roofType;
    }

    public String getWallType() {
        return wallType;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public void setWallType(String wallType) {
        this.wallType = wallType;
    }
}
