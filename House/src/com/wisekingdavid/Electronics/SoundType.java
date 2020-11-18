package com.wisekingdavid.Electronics;

public class SoundType {
    private String manufacturer;
    private String modelNumber;
    private String color;
    private int size;

    public SoundType(String manufacturer, String modelNumber, String color, int size) {
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.color = color;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
