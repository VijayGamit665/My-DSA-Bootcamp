package com.dsa.RecursionBasics;

public class Recursion {

    public static void main(String[] args) {
        int n = 10;
        int m = 1;
        PrintDec(n);
        PrintIncre(m);

    }

    public static void PrintDec(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }
    public static void PrintIncre(int m){
        if (m == 10){
            System.out.print(m);
            return;
        }

        System.out.print(m+" ");
        PrintIncre(m+1);
    }
}
