package com.dsa.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Findmaximum {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();

        List.add(2);
        List.add(5);
        List.add(9);
        List.add(6);
        List.add(8);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < List.size(); i++) {
            if (max < List.get(i)) {
                max = List.get(i);
            }

            // Other Ways
            max = Math.max(max, List.get(i));

        }
        System.out.print(max);
    }
}
