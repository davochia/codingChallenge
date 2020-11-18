package com.example.loppscalculation;

import javax.swing.*;

public class UserControlledLoop {
    public static void main(String[] args) {
        int maxValue;
        String input = JOptionPane.showInputDialog("How high you want to go?");
        maxValue = Integer.parseInt(input);

        System.out.println("Number          Number squared");
        System.out.println("------------------------------");

        for (int i = 1; i <= maxValue; i++){
            System.out.println(i + "\t\t\t\t" + i * i);
        }
    }
}
