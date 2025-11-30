package org.example.arrayCodingExercises;

public class TwoDimensionalArray {
    public static int sumDiagonalElements(int[][] array) {
        /* My own solution
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        } */

        /* LeetCode solution */
        int sum = 0;
        int numRows = array.length;
        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
