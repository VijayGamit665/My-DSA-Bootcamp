package com.dsa.array;

import com.sun.source.doctree.SummaryTree;

public class PrintSubarrays {

    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5, 8, 9,};
        printSubarray(numbers);
    }

    public static void printSubarray(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int Start = i;                                   // Start find
            for (int j = i; j < numbers.length; j++) {
                int end = j;                               // end find
                for (int k = Start; k <= end; k++) {           // print
                    System.out.print(numbers[k] + " ");   // subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays " + ts);

    }
}
