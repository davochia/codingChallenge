package com.example.joptionpane;

import javax.swing.*;

public class ReadJOptionPane {
    public static void main(String[] args) {
        // Strings
        String name;
        String surname;

        name = JOptionPane.showInputDialog("Please enter your first name");
        surname = JOptionPane.showInputDialog("Please enter your surname");

        JOptionPane.showMessageDialog(null, name + " " + surname);

        // Integer conversion

        int fnum;
        int snum;
        String input;

        input = JOptionPane.showInputDialog("Enter first number");
        fnum = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter second number");
        snum = Integer.parseInt(input);

        double average = (fnum + snum)/2;

        JOptionPane.showMessageDialog(null, "Averave: " + average);



    }
}
