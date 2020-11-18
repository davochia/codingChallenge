package com.example.arrays;

import java.util.ArrayList;

public class TheArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mac");
        names.add("paul");
        names.add("soul");
        names.add("peter");

        for (int i = 0; i < names.size(); i++){
            System.out.println(i +" " + names.get(i));
        }
    }
}
