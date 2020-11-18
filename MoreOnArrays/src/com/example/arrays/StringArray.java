package com.example.arrays;

public class StringArray {
    public static void main(String[] args) {
        String [] names = getName();

        for (int i = 0; i < names.length; i++){
            if (names[i] != null) {
                System.out.println(names[i].charAt(0));
            }
        }

    }
    public static String [] getName(){
        String[] names = new String[6];

        names[0] = "john";
        names[1] = "mac";
        names[2] = "kol";
        names[3] = "dav";
        names[4] = "tom";

        return names;

    }
}
