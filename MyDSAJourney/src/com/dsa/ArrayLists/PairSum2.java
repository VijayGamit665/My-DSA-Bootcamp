package com.dsa.ArrayLists;

import java.util.ArrayList;

public class PairSum2 {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();

        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);
        int Target = 15;

        System.out.println(pairSum2(List, Target));
    }
    public static boolean pairSum2(ArrayList<Integer> List, int Target) {

        int bp = -1;
        int n = List.size();
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) > List.get(i + 1)) { // Breaking Point
                bp = i;
                break;
            }
        }
        int lp = bp + 1; // smallest
        int rp = bp;   // largest

        while (lp != rp) {

            // Case 1
            if (List.get(lp) + List.get(rp) == Target) {
                return true;
            }
            // Case 2

            if (List.get(lp) + List.get(rp) < Target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;

    }

}
