package com.dsa.Array2D;

import java.util.Currency;

public class SpiralMatrix {

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4, 21},
                {5, 6, 7, 8, 22},
                {9, 10, 11, 12, 23},
                {13, 14, 15, 16, 24},
                {17, 18, 19, 20, 25}};
        printSpiral(matrix);

    }

    public static void printSpiral(int matrix[][]) {
        int starRow = 0;
        int starCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (starRow <= endRow && starCol <= endCol) {
            // Top Boundary
            for (int j = starCol; j <= endCol; j++) {
                System.out.print(matrix[starRow][j] + " ");
            }
            // right Boundary
            for (int i = starRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom Boundary
            for (int j = endCol - 1; j >= starCol; j--) {
                if (starRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left Boundary
            for (int i = endRow - 1; i >= starRow + 1; i--) {
                if (starCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][starCol] + " ");
            }
            starCol++;
            starRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }


}
