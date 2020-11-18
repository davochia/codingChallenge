package com.wisekingdavid.furnitures;

public class Bed {
    private Size size;
    private String type;

    public Bed(Size size, String type) {
        this.size = size;
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
