package com.dsa.Sorting;

import java.util.Optional;

// TIme Complex City = o(n2)

public class bubbleSorting {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int arrs[] = {5, 4, 1, 3, 2, 5, 3, 1};
        bubbleSort(arr);
        printArr(arr);
        selectionsort(arr);
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
        contingSort(arrs);
        printArr(arrs);

    }

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 2; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Time complex city = o(n2)
    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


    // Time complex city = o(n2)
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
         int curr = arr[i];
         int prev = i-1;

         // finding out the correct pos to insert

         while (prev >=0 && curr > arr[prev]){
             arr[prev+1] = arr[prev];
             prev--;
         }
         // insertion
            arr[prev+1] = curr;
        }
    }

    // Time complex city = o(n2)
    public static void contingSort(int arrs[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arrs.length;i++){
            largest = Math.max(largest,arrs[i]);
        }
        int count[] = new int[largest+1];
        for (int i=0;i<arrs.length;i++){
            count[arrs[i]]++;
        }
        // Sorting
        int j=0;
        for (int i=0; i<count.length;i++){
            while (count[i]>0){
                arrs[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
