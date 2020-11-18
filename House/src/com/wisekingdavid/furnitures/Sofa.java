package com.wisekingdavid.furnitures;

public class Sofa {
    private String color;
    private String cover;
    private Size theSize;

    public Sofa(String color, String cover, Size theSize) {
        this.color = color;
        this.cover = cover;
        this.theSize = theSize;
    }

    public String getColor() {
        return color;
    }

    public String getCover() {
        return cover;
    }

    public Size getTheSize() {
        return theSize;
    }
}
