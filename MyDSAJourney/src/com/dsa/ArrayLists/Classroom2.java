package com.dsa.ArrayLists;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;

public class Classroom2 {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        // Print the Size of ArrayList
        System.out.println("Size of ArrayList = " + List.size());

        // Print the ArrayList    Time Complex City = O(n)

        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + " ");
        }

        System.out.println();

        // Print Reverse ArrayList    Time Complex City = O(n)

        for (int i = List.size() - 1; i >= 0; i--) {
            System.out.print(List.get(i) + " ");
        }

        System.out.println();

    }
}
