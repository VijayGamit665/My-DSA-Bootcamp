package com.dsa.Array2D;

public class SearchSortMetrix {

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        staircaseSearch1(matrix, 30);
        staircaseSearch(matrix, 33);

    }

    public static void SpiralMatrix(int matrix[][]) {
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix.length - 1;

        while (StartRow <= EndRow && StartCol <= EndCol) {
            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }
            for (int i = StartRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");
            }
            for (int j = EndCol - 1; j >= StartCol; j--) {
                if (StartRow == EndRow) {
                    break;
                }
                System.out.print(matrix[EndRow][j] + " ");
            }
            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                if (StartCol == EndCol) {
                    break;
                }
                System.out.print(matrix[i][StartCol] + " ");
            }
            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
        System.out.println();


    }

    public static boolean staircaseSearch(int matrix[][], int Key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == Key) {
                System.out.println("Found Key At " + "( " + row + " " + col + " )" + " ");
                return true;
            } else if (Key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println(" Key is not Found ");
        return false;
    }

    public static boolean staircaseSearch1(int matrix[][], int Key) {
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col <= matrix[0].length - 1) {
            if (matrix[row][col] == Key) {
                System.out.println("Found Key At " + "( " + row + " " + col + " )");
                return true;
            } else if (Key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Key is not found ");
        return false;
    }


}
