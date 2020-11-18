package com.example.arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int [] num1 = {1, 2, 3, 4};
        int [] num2 = {1, 2, 3,4};

        boolean arraysEqual = true;
        int i = 0;

        if (num1.length != num2.length){
           arraysEqual = false;
        }
        while (arraysEqual && i < num1.length){
            if (num1[i] != num2[i]){
                arraysEqual = false;
            }
            i++;
        }
        if (arraysEqual){
            System.out.println("The same");
        }else {
            System.out.println("Not the same");
        }
    }
}
