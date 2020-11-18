package com.example.textfiles;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        int count = 0;
        double average;
        File file = new File("ResultFile.txt");

        if (file.exists()) {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
                //System.out.println(inputFile.nextLine());

                sum += inputFile.nextInt();
                count++;

            }inputFile.close();

            average = sum / (double) count;
            JOptionPane.showMessageDialog(null,"Sum: " + sum + "\n" + "values: " + count + "\n" + "Average: " + average);

        } else {
            JOptionPane.showMessageDialog(null, "File does not exist!");
        }
    }
}
