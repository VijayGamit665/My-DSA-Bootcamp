package com.dsa.Array2D;

public class Q2DPractice {

    public static void main(String[] args) {
        int arr[][] = {{1,4,9},
                      {11,4,3},
                      {2,2,3}};

        printArrays(arr);

    }

    // Print out the sum of the numbers inthe second row of the “nums” array.
    public static void printArrays(int arr[][]){
        int sum = 0;
        for (int i=1;i==1;i++){
            for (int j=0; j<=2; j++){
                sum+=arr[i][j];
            }
        }
     System.out.println(sum);
    }

}
