package com.example.arrays;

public class CopyArrays {
    public static void main(String[] args) {
        int [] num1 = {1, 2, 3, 4};
        //        int [] num2 = num1;


        int [] num2 = new int[num1.length];

        for (int i = 0; i < num1.length; i++){
            num2[i] = num1[i];

        }

        num1[1] = 89;

        printArray(num1);
        System.out.println();
        printArray(num2);

    }
    public static void printArray(int [] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}
