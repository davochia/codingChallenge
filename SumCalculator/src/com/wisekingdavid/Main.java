package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(30);
        calculator.setSecondNumber(20);

        System.out.println(calculator.getMultiplicationResult());
    }
}
