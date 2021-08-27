package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
	    double myMinDoubleValue = Double.MIN_VALUE;
	    double myMaxDoubleValue = Double.MAX_VALUE;
	    System.out.println("Min float value = " + myMinFloatValue);
        System.out.println("Max float value = " + myMaxFloatValue);
        System.out.println("Min double value = " + myMinDoubleValue);
        System.out.println("Max double value = " + myMaxDoubleValue);

        int myValueInt = 5;
        float myValueFloat = 5.25F;  // declaring the type of variables is a good practice.
        double myValueDouble = 5D;
        float testCastingVar = (float) 5.25;  // We can cast the value like this.
    }
}
