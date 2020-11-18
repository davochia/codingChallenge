package com.example.arrays;

public class HighestArraysALowest {
    public static void main(String[] args) {
        int [] num1 = {56, 89,56, 97, 24};

        int highestValue = num1[0];

        for (int i = 1; i < num1.length; i++){
            if(num1[i] > highestValue ){
                highestValue = num1[i];
            }
        }
        System.out.println("Highest number: " + highestValue);

        int lowestValue = num1[0];

        for (int i = 0; i < num1.length; i++){
            if (lowestValue > num1[i]){
                lowestValue = num1[i];
            }
        }
        System.out.println("Lower number: " + lowestValue);
    }
}
