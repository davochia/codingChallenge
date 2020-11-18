package com.example.switchstatement;

import javax.swing.*;

public class SwithStatement {
    public static void main(String[] args) {
        int grade;

        String input = JOptionPane.showInputDialog("Enter grade");

        grade = Integer.parseInt(input);

        switch (grade){
            case 80:
                JOptionPane.showMessageDialog(null, "Excellent");
                break;

            case 50:
                JOptionPane.showMessageDialog(null, "Pass");
                break;

            case 40:
                JOptionPane.showMessageDialog(null, "Fail");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Not a valid grade");

        }
        System.exit(0);
    }
}
