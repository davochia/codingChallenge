package com.example.loops;

public class Loops {
    public static void main(String[] args) {
        //while loops
        int i = 0;

        while (i < 10){
            System.out.println("Not yet");
            i += 1;
        }
        System.out.println("Done!");
        System.out.println("--------------------------------");

        // do-while loop

        int j = 0;
        do{
            System.out.println("Starting program");
            j += 1;
        }while (j < 5);

        System.out.println("--------------------------------");

        // for loops

        for(int k = 0; k < 5; k++){
            System.out.println("Testing");
        }

    }
}
