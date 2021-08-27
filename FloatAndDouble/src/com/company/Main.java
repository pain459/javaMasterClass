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

        int myValueInt = 5 / 3;
        float myValueFloat = 5F / 3F;  // declaring the type of variables is a good practice.
        double myValueDouble = 5.00 / 3.00; // JAVA uses double by default for floating point numbers. So, no need to specify this again. Going forward in this course, we will only double.
        float testCastingVar = (float) 5.25;  // We can cast the value like this.
        System.out.println("My Int value = " + myValueInt);
        System.out.println("My Float value = " + myValueFloat);
        System.out.println("My Double value = " + myValueDouble);
    }
}
