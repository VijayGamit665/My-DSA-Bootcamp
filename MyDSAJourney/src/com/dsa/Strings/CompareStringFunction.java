package com.dsa.Strings;

import java.awt.desktop.SystemSleepEvent;

public class CompareStringFunction {
    public static void main(String[] args) {
        String s1 = "Vijay";
        String s2 = "Vijay";
        String s3 = new String("Vijay");
        if (s1 == s2) {
            System.out.println("Strings is equal");
        } else {
            System.out.println("String is not equal");
        }
        // value is same but new String is not compare

        if (s1 == s3) {
            System.out.println("String is equal");
        } else {
            System.out.println("String is not equal");
        }
        // new String stored value is compare to s1 & s3

        if (s1.equals(s3)) {
            System.out.println("String is equal");
        } else {
            System.out.println("String is not equal");
        }
    }

}
