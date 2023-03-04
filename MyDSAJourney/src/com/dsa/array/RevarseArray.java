package com.dsa.array;

import java.util.Arrays;

//Tc : 0(n) or o(n/2)
//sc : 0(1)
public class RevarseArray {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 6, 5, 8, 9, 10};
        reverseArrray(numbers);

        //for print reverse array
//      System.out.println(Arrays.toString(numbers));

        for(int n : numbers){//enhance for loop
            System.out.print(n +" ");
        }
//        Arrays.stream(numbers).forEach(n-> System.out.println(n)); // foreach loop ,jav8

//        Arrays.stream(numbers).filter(a-> a%2==0).forEach(n-> System.out.println(n)); // find even num by using filter java8
    }
    public static void reverseArrray(int[] arr){
        int start=0,end=arr.length-1;

        //with while loop
        while (start < end ){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        //with for loop
//        for(int i = start;i<end/2;i++){
//            int temp = arr[end];
//            arr[end] = arr[start];
//            arr[start] = temp;
//        }
    }

}
