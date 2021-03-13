package com.wisekingdavid;

public class CircleArea implements Shape{

    private Circle circle;

    public CircleArea(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double getArea() {
        return circle.computeArea();
    }
}
