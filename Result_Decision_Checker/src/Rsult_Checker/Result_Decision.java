package Rsult_Checker;

import javax.swing.*;

public class Result_Decision {
    public static void main(String[] args) {

        int number;
        String input;

        input = JOptionPane.showInputDialog("Enter grade");
        number = Integer.parseInt(input);


        if (number < 50){
            if(number >= 45){
                JOptionPane.showMessageDialog(null, "Resit");
            }else{
                JOptionPane.showMessageDialog(null, "Failed");
            }
        }else{
            if (number >= 75){
                JOptionPane.showMessageDialog(null, "Distinction");
            }else {
                JOptionPane.showMessageDialog(null, "Passed");
            }
        }
    }
}
