package com.dsa.RecursionBasics;

public class FirstOccurrence {
    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 8, 7, 9, 6, 5, 4, 2, 8, 5, 3,};
        System.out.println(FOccurrence(arr, 5, 0));
        System.out.println(lOccurrence(arr, 5, 0));

    }

    public static int FOccurrence(int arr[], int Key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == Key) {
            return i;
        }

        return FOccurrence(arr, Key, i + 1);
    }

    public static int lOccurrence(int arr[], int Key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lOccurrence(arr, Key, i + 1);
        if (isFound == -1 && arr[i] == Key) {
            return i;
        }
        return isFound;
    }

}
