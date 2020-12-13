package com.wisekingdavid;

public class Rectangle implements Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return Rectangle.class.getSimpleName();
    }
}
