package com.wisekingdavid;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return distance(new Point(x, y));
    }

    public double distance(Point z) {
        return Math.sqrt(Math.pow(x-z.getX(), 2)+Math.pow(y-z.getY(), 2));
    }
}
