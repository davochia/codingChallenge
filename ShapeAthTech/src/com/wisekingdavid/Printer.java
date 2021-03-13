package com.wisekingdavid;

public class Printer {

    private Shape shape;

    public Printer(Shape shape) {
        this.shape = shape;
    }


    public void printAreaName() {
        System.out.println("Shape: " + shape.getClass().getSimpleName() + " | Area: " + shape.getArea());
    }
}
