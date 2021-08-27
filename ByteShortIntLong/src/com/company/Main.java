package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myIntMinValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myIntMinValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1)); // output will be -2147483648. This is called as an overflow. System allocated memory for int and when we give a bigger value
        // system will anyways try to fit in and hence the overflow is observed.
        System.out.println("Busted min value = " + (myIntMinValue - 1)); // output will be 2147483647. Concept is a same above, but termed as underflow.
        int maxIntTest = 2147483647; // add one to the value and system will throw an error.
        int minIntTest = -2_147_483_648; // One more way of writing the number.
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);
//        Declaring long values to variables.
        long myLongValue = 100L; // By default java considers the number as int. Hence the L (or small l) representation will make the system understand it is long data type.
        System.out.println(myLongValue);
        long maxLongValueTest = 2_147_483_647_785L; // now we can write the number without any errors.
        System.out.println(maxLongValueTest);

        int myTotal = (myIntMinValue / 2);
        byte myNewByteTotal = (byte) (myMinByteValue / 2); // Casting the output to byte.
        short myNewShortTotal =(short) (myMaxShortValue / 2); // Casting the output to short.
    }
}

