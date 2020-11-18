package com.wisekingdavid;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] newArray = getIntegers(5);
        int[] sorted = sortArray(newArray);

        printArray(sorted);

    }

    public static int[] getIntegers(int size){
        int[] arrayNumbers = new int[size];
        System.out.println("Please enter numbers: \r");
        for (int i = 0; i < arrayNumbers.length; i++){
            arrayNumbers[i] += sc.nextInt();
        }
        return arrayNumbers;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("#" + i + " value: " + array[i]);
        }
    }

    public static int[] sortArray(int[] arrayToSort){
        int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);

//        int[] sortedArray = new int [arrayToSort.length];
//        for (int i = 0; i < arrayToSort.length; i++) {
//            sortedArray[i] = arrayToSort[i];
//        }

        int temp;
        boolean finishSorting = true;
        while (finishSorting){
            finishSorting = false;
            for (int i = 0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    finishSorting = true;
                }
            }
        }
        return sortedArray;
    }
}
