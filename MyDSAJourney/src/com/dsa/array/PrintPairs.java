package com.dsa.array;

public class PrintPairs {
    public static void main(String[] args) {
      int numbers[] = {1,2,3,4,5,6,7,8,9,10};
      printPairs(numbers);
    }
    public static void printPairs(int numbers[]){
        for (int i=0; i<numbers.length; i++){  // 1 to n time rum
            int curr = numbers[i]; // curr min 1,2,3,4,5,6,7,8,9,10
            for (int j=i+1; j<numbers.length; j++){ //
                System.out.print("(" + curr + " , " + numbers[j] + " )");
            }
            System.out.println();
        }
    }
}
