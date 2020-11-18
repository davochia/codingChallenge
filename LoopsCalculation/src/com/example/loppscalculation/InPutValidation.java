package com.example.loppscalculation;

import javax.swing.*;

public class InPutValidation {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter number in range 1 to 100");
        int number = Integer.parseInt(input);

        while (number < 1 || number >  100){
            JOptionPane.showMessageDialog(null, "Out of range");
            input = JOptionPane.showInputDialog("Enter number in range 1 to 100");
            number = Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "Range Entered!");
    }
}
