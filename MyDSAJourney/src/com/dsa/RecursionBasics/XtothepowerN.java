package com.dsa.RecursionBasics;

import java.util.logging.XMLFormatter;

public class XtothepowerN {
    public static void main(String[] args) {

        System.out.println(power(2, 5));
        System.out.println(optimixePower(2, 5));
    }

    public static int power(int x, int n) { // Time Complexcity = O(n)

        if (n == 0) {
            return 1;
        }
        int Xnm1 = power(x, n - 1);
        int xn = x * Xnm1;
        return xn;

        // Shortcut

        // return x * power(x , n-1);
    }

    // OptimixePower function x to the power of N
    public static int optimixePower(int a, int n) { // Time ComplexCity = O(logn)
        if (n == 0) {
            return 1;
        }

        int halfPower = optimixePower(a, n / 2);
        int halfPowersq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;

    }
}
