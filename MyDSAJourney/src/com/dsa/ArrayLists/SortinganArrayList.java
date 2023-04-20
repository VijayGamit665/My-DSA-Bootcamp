package com.dsa.ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortinganArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);

        System.out.println(List);
        Collections.sort(List);  // Ascending Oder
        System.out.println("Ascending Oder = " + List);

        // Descending oder
        Collections.sort(List, Collections.reverseOrder());
        System.out.println("Descending oder = " + List);
    }
}
