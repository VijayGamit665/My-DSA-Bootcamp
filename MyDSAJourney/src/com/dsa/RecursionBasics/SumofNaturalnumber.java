package com.dsa.RecursionBasics;

public class SumofNaturalnumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(culcSum(n));
    }

    public static int culcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = culcSum(n - 1);
        int Sn = n + Snm1;
        return Sn = n + culcSum(n - 1);
    }
}
