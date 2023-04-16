package com.dsa.Backtracking;

public class GridWays {

    public static void main(String[] args) {

        int n = 4, m = 4;
        System.out.println(gridWays(0, 0, n, m));
    }

    public static int gridWays(int i, int j, int n, int m) {

        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == n) { // boundary cross condition
            return 0;
        }
        int W1 = gridWays(i + 1, j, n, m);
        int W2 = gridWays(i, j + 1, n, m);
        return W1 + W2;

    }

}
