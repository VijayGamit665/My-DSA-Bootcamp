package com.dsa.array;

public class BinarySearchFirst {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 6, 5, 8, 9, 10};
        int Key = 66;

        System.out.println(binarySearch(numbers, Key));
    }

    public static int binarySearch(int numbers[], int Key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparisons
            if (numbers[mid] == Key) {
                return mid;
            }
            if (numbers[mid] < Key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
}
