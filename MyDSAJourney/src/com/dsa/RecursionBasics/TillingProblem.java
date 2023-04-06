package com.dsa.RecursionBasics;

public class TillingProblem {
    public static void main(String[] args) {

        System.out.println(tilingproblem(4));
    }

    public static int tilingproblem(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        // Kamm
        //Vertical Choice
        int fnm1 = tilingproblem(n - 1);

        // Horizontal choice

        int fnm2 = tilingproblem(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
}
