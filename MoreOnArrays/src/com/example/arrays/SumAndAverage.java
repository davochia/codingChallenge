package com.example.arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int [] num1 = {56, 89,56, 97, 24};

        int sum = 0;

        for (int i = 1; i < num1.length; i++){
            sum += num1[i];

        }

        double average = (double) sum/num1.length;
        System.out.println("Sum: " + sum);
        System.out.println("Highest number: " + average);


    }
}
