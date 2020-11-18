package com.compare.strings;

import javax.swing.*;

public class CompareStrings {
    public static void main(String[] args) {
        String country1 = JOptionPane.showInputDialog("Enter country 1");
        String country2 = JOptionPane.showInputDialog("Enter country 2");

//        if (country1.equals(country2)){
//            System.out.println("Are same");
//        }else{
//            System.out.println("Not same");
//        }

        if (country1.compareTo(country2) == 0){
            System.out.println("Are same");
        }if (country1.compareTo(country2) < 0){
            System.out.println("country1 first");
        }if(country1.compareTo(country2) > 0){
            System.out.println("country2 first");
        }

        System.exit(0);
    }
}
