package com.dsa.ArrayLists;

import java.util.ArrayList;

public class MultiDimensionalArrayLists {


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> List = new ArrayList<>();

        List.add(1);
        List.add(2);
        mainList.add(List);

        ArrayList<Integer> List2 = new ArrayList<>();

        List2.add(3);
        List2.add(4);
        mainList.add(List2);

        ArrayList<Integer> List3 = new ArrayList<>();
        List3.add(5);
        List3.add(6);
        mainList.add(List3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // Other Multi-Dimensional ArrayList
        System.out.println("Other Multi-Dimensional ArrayList");

        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();

        ArrayList<Integer> List11 = new ArrayList<>();
        ArrayList<Integer> List22 = new ArrayList<>();
        ArrayList<Integer> List33 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            List11.add(i * 1);
            List22.add(i * 2);
            List33.add(i * 3);
        }
        mainList2.add(List11);
        mainList2.add(List22);
        mainList2.add(List33);
        System.out.print(mainList2);
        System.out.println();

        // nested Loops

        for (int i = 0; i < mainList2.size(); i++) {
            ArrayList<Integer> currentList = mainList2.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + "  ");

            }
            System.out.println();
        }

    }

}
