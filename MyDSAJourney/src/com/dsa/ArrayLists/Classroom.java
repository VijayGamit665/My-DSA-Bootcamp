package com.dsa.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        // Operations on ArrayList
        // Add Element  Time Complex city = O(1)
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.println("Add Element = " + List);

        // Get Element  Time Complex city = O(1)
        int element = List.get(2);
        System.out.println("Get Element =  " + element);

        // Remove Element Time Complex city = O(n)
        List.remove(3);
        System.out.println("Remove Element = " + List);

        // Set Element at Index Time Complex city = O(n)
        List.set(2, 10);
        System.out.println("Set Element = " + List);

        // Contains Element Time Complex city = O(n)
        System.out.println("Contains Element = " + List.contains(1));
        System.out.println("Contains Element = " + List.contains(11));

        // Different Type of Add Element Time Complex city = O(n)

        List.add(1, 9);
        System.out.println("Different Type of Add Element " + List);
    }
}
