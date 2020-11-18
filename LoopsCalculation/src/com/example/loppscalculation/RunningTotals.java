package com.example.loppscalculation;

import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales = 0.0;

        DecimalFormat euro = new DecimalFormat("#,##0.00");

        String input = JOptionPane.showInputDialog("Enter sales days");
        days = Integer.parseInt(input);

        for (int count = 1; count <= days; count++){
            input = JOptionPane.showInputDialog("Enter sales for day" + count);
            sales = Double.parseDouble(input);

            totalSales += sales;
        }
        JOptionPane.showMessageDialog(null, "Total sales: " + euro.format(totalSales));
        System.exit(0);
    }
}
