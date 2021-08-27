package com.company;

public class primitiveTypesChallenge {
    public static void main(String[] args) {
        byte numberByte = (byte) 128;
        short numberShort = (short) 256;
        int numberInt = 1024;
        long numberLong = 50000 + 10 * (numberByte + numberShort);
        System.out.println(numberLong);
    }
}
