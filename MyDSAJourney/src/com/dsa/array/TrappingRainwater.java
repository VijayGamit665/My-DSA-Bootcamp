package com.dsa.array;

public class TrappingRainwater {
    public static void main(String[] args) {
        int hight[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainwater(hight));

    }

    public static int trappingRainwater(int[] hight) {

        // calculate left max boundary -- arrays

        int leftMax[] = new int[hight.length];
        leftMax[0] = hight[0];
        for (int i = 1; i < hight.length; i++) {
            leftMax[i] = Math.max(hight[i], leftMax[i - 1]);
        }

        // calculate right max boundary -- arrays

        int rightMax[] = new int[hight.length];
        rightMax[hight.length - 1] = hight[hight.length - 1];
        for (int i = hight.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(hight[i], rightMax[i + 1]);
        }
        int trappedWater = 0;

        // loop

        for (int i = 0; i < hight.length; i++) {

            // waterlevel = (left max boundary , right max boundary)

            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trappaed water = waterlevel - hight[i]

            trappedWater += waterlevel - hight[i];
        }

        return trappedWater;

    }
}