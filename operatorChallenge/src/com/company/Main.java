package com.company;

public class Main {

    public static void main(String[] args) {
        double var1 = 20.00D;
        double var2 = 80.00D;
        double var3 = (var1 + var2) * 100D;
        double remainder1 = var3 % 40.0;
        boolean isNoremainder = remainder1 == 0;
        System.out.println(isNoremainder);
        if (!isNoremainder) {
            System.out.println("Got some reminder");
        }
//        int result = (int) reminder1;
//        boolean boolValue;
//        boolValue = result == 0;
////        System.out.println(boolValue);
//        boolean boolValue1 = boolValue ? true : false;
////        System.out.println(boolValue1);
//        if (boolValue1 != true){
//            System.out.println("Got some remainder");
//        }
    }
}
