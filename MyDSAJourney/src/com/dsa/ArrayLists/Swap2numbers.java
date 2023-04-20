package com.dsa.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Swap2numbers {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);

        int index1 = 1, index2 = 3;
        System.out.println(List);
        Swap(List, index1, index2);
        System.out.println(List);
    }

    public static void Swap(ArrayList<Integer> List, int index1, int index2) {

        int temp = List.get(index1);
        List.set(index1, List.get(index2));
        List.set(index2, temp);
    }
}
