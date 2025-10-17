package homework3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int mainDiagonal = 0;
        int auxiliaryDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal += matrix[i][i];
            auxiliaryDiagonal += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Main diagonal sum: " + mainDiagonal);
        System.out.println("Auxiliary diagonal sum: " + auxiliaryDiagonal);
    }
}