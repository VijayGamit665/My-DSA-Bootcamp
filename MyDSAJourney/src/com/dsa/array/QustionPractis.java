package com.dsa.array;

import java.security.Key;

public class QustionPractis {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        int nums1[] = {1,2,3,4,};
        int nums2[] = {1,1,1,3,3,4,3,2,4,2};
        int nums3[] = {4, 2, 0, 3, 2, 5};
        int Key = 33;
        System.out.println(containduplicate(nums));
        System.out.println(containduplicate(nums1));
        System.out.println(containduplicate(nums2));
        System.out.println(binarySarch(nums,Key));
        System.out.println(trappingRainwater(nums3));
    }

    //  Question 1 Given an integer array nums, return true if any value appears
   //  at least twice in the array, and returnfalse if every element is distinct

    public static boolean containduplicate(int nums[]) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }

        }

        return false;
    }
    // Question 2 . There is an integer array nums sorted in ascending order (with distinct values)
    // Prior to being passed to your function, nums is possibly rotated at an unknown
    // pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k]
    // nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For
    // example, [0,1,2,4,5,6,7] might  be rotated at pivot index 3   and become [4,5,6,7,0,1,2]
    // Given the array nums after the possible rotation and an integer target, returnthe
    // index oftarget if it is in nums, or -1   if it is not in nums
    // You must write an algorithm with O(log n) runtime complexity.

    public static int binarySarch(int nums[] , int Key){
        int start = 0, end = nums.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == Key){
                return mid;
            }
            if (nums[mid]<Key){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
        return -1;
    }

    // Question 4: Given n non-negative integers representing an elevation map where the width of
    // each bar is 1, compute how much water it can trap after raining.
    public static int trappingRainwater(int[] nums3) {

        // calculate left max boundary -- arrays

        int leftMax[] = new int[nums3.length];
        leftMax[0] = nums3[0];
        for (int i = 1; i < nums3.length; i++) {
            leftMax[i] = Math.max(nums3[i], leftMax[i - 1]);
        }

        // calculate right max boundary -- arrays

        int rightMax[] = new int[nums3.length];
        rightMax[nums3.length - 1] = nums3[nums3.length - 1];
        for (int i = nums3.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(nums3[i], rightMax[i + 1]);
        }
        int trappedWater = 0;

        // loop

        for (int i = 0; i < nums3.length; i++) {

            // waterlevel = (left max boundary , right max boundary)

            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trappaed water = waterlevel - hight[i]

            trappedWater += waterlevel - nums3[i];
        }

        return trappedWater;

    }
}



