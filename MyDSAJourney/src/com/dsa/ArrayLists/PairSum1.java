package com.dsa.ArrayLists;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;

public class PairSum1 {

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        int Target = 5;

        System.out.println(paiSum(height, Target));

    }

    public static boolean paiSum(ArrayList<Integer> height, int Target) {

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                if (height.get(i) + height.get(j) == Target) {
                    return true;
                }
            }
        }
        return false;
    }

}
