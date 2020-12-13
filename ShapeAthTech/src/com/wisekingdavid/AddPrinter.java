package com.wisekingdavid;

public class AddPrinter {
    private Shape shape;

    public AddPrinter(Shape shape) {
        this.shape = shape;
    }

    public void printArea(){
        System.out.println("Shape area: " + shape.getArea());
    }
}
