package com.example.textfiles;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        // Create if not exist and open file if exist
        PrintWriter outputFile = new PrintWriter("ResultFile.txt");

        outputFile.println("Line 1");
        outputFile.println("Line 2");
        outputFile.println("Line 3");
        outputFile.println("Line 4");


        outputFile.close();

    }
}
