package com.dsa.array;

public class MaxSubarrarsPrefixSum {
      // Time Complex city= O(n2)
    public static void main(String[] args) {
        int numbers[] = {-1,-2,-3,-4,-5,-6,-7,-8,-9};
        int num[] = {9,8,-7,6,-4,3,-2,1};
        prefixArraySum(numbers);
        kadanes(num);
        kadanesMinSub(numbers);
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

    public static void kadanes(int num[]){
       int ms = Integer.MIN_VALUE;
       int cs = 0;
       for (int i=0; i<num.length; i++){
           cs = cs + num[i];
           if (cs<0){
               cs=0;
           }
           ms = Math.max(cs , ms);
       }
       System.out.println("our max subarray sum is " + ms);
    }

    public static void kadanesMinSub(int numbers[]){
        int ms = 0;
        int cs = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++){
            ms = numbers[i];
            if(ms>0){
                cs=ms;
            }
            cs = Math.max(ms,cs);
        }
        System.out.println("our  kadanes min Subarray is " + cs);
    }
}


