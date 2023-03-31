package com.dsa.RecursionBasics;

public class Recursion {

    public static void main(String[] args) {
        int n = 10;
        PrintDec(n);

    }

    public static void PrintDec(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }
}
