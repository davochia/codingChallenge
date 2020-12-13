package com.wisekingdavid;

public class TriangleArea implements Shape {
    private Triangle triangle;

    public TriangleArea(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea() {
        return triangle.getArea();
    }

    @Override
    public String getName() {
        return triangle.getName();
    }
}
