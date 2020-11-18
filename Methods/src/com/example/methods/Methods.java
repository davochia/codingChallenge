package com.example.methods;

public class Methods {
    public static void main(String[] args) {

        printAverage(10, 90);

       double average = getAverage(89, 43);
       System.out.println("Average: " + average);

       String fullName = fullName("Dav", "Och");
        System.out.println("Full Name: "+ fullName);


        int value = 200;
        if (isValid(value)){
            System.out.println("In range");
        }else {
            System.out.println("Not in range");
        }

    }

    /**
     * Method prints the average of 2 numbers
     * @param num1 first value
     * @param num2 second value
     */
    public static void printAverage(int num1, int num2){
        double average = (num1 + num2)/2.0;
        System.out.println("Average: " + average);
    }

    /**
     * return an average of 2 numbers
     * @param num1 first number
     * @param num2 second number
     * @return return the average of values
     */

    public static double getAverage(int num1, int num2){
        double average = (num1 + num2)/2.0;
        return average;
    }
    public static final String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    public static boolean isValid(int value){

        return  (value >=1 && value <=100);
    }
}
