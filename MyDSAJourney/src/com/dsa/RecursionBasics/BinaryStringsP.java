package com.dsa.RecursionBasics;

public class BinaryStringsP {
    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }

    public static void printBinaryStrings(int n, int lastplace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        //Kaam
        if (lastplace == 0) {
            // sit 0 on chair n
            printBinaryStrings(n - 1, 0, str + "0");
            printBinaryStrings(n - 1, 1, str + "1");
        } else {
            printBinaryStrings(n - 1, 0, str + "0");
        }

        // other Ways

        // printBinaryStrings(n-1,0,str+"0");
        // if (lastplace == 0){
        //     printBinaryStrings(n-1,1,str+"1");
        // }
    }
}
