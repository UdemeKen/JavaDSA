package org.example;

import org.example.array.twodimensionalarray.CreateArray;
import org.example.array.twodimensionalarray.InsertArray;
import org.example.arrayCodingExercises.*;
import org.example.calculateAverageTemperature.Calculate;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateMatrix.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
