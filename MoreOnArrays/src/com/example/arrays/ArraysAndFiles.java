package com.example.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArraysAndFiles {
    public static void main(String[] args) throws FileNotFoundException {
        int [] values = new int[11];

        int i = 0;

        File file = new File("value.txt");

        if(file.exists()){
            Scanner scInput = new Scanner(file);

            while (scInput.hasNext() && i < values.length){
                values[i] = scInput.nextInt();
                i++;
            }
            scInput.close();

            for (int value : values){
                System.out.println(value);
            }
        }
    }
}
