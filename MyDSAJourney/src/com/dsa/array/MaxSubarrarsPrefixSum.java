package com.dsa.array;

public class MaxSubarrarsPrefixSum {
      // Time Complex city= O(n2)
    public static void main(String[] args) {
        int numbers[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        prefixArraySum(numbers);
    }

    public static void prefixArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int Prefix[] = new int[numbers.length];  // new prefix array

        Prefix[0] = numbers[0];

        // calculate prefix array
        for (int i = 1; i < Prefix.length; i++) {
            Prefix[i] = Prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Prefix sum " + maxSum);
    }

}


