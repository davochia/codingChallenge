package com.wisekingdavid.furnitures;

public class Cuboards {
    private Size theSize;
    private String color;

    public Cuboards(Size theSize, String color) {
        this.theSize = theSize;
        this.color = color;
    }

    public Size getTheSize() {
        return theSize;
    }

    public String getColor() {
        return color;
    }
}
