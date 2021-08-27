package com.company;

public class Main {

    public static void main(String[] args) {
//        byte
//        short
//        int
//        long
//        float
//        double
//        char
//        boolean
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);
//        Adding a unicode character into the string.
        myString = myString + " \u00A9 2021";
        System.out.println("My string is equal to " + myString);
//        Experimenting with numbers as strings.
        String myNumber = "125.50";
        myNumber = myNumber + "125.50";
        System.out.println(myNumber);  // this will print a string which is expected. 2 strings concatenated.
        String lastString = "20";
        int lastInt = 20;
        lastString = lastString + lastInt;
        System.out.println(lastString);
        double doubleNumber = 250.56D;
        lastString = lastString + doubleNumber;
//        This is the inefficient way to adding strings. But this is only for example.
        System.out.println("My string is equal to " + lastString);
    }
}
