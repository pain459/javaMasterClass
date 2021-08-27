package com.company;

public class Main {

    public static void main(String[] args) {

      byte numberByte = (byte) 128;
      short numberShort = (short) 256;
      int numberInt = 1024;
      long numberLong = 50000L + 10L * (numberByte + numberShort + numberInt);
      System.out.println(numberLong);

    }
}
