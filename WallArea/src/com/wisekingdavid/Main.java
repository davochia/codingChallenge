package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall();
        System.out.println(wall1.getHeight());

        System.out.println("-----------------------------------------");

        Wall wall2 = new Wall(4, -5);
        System.out.println(wall2.getArea());

        wall2.setHeight(-1.5);
        System.out.println(wall2.getHeight());
        System.out.println(wall2.getWidth());
        System.out.println(wall2.getArea());
    }
}
