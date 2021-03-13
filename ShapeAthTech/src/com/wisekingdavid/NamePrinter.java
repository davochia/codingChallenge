package com.wisekingdavid;

public class NamePrinter {
    Shape shape;

    public NamePrinter(Shape shape) {
        this.shape = shape;
    }

    public void namePrinter(){
        System.out.println(shape.getClass().getSimpleName()); ;
    }
}
