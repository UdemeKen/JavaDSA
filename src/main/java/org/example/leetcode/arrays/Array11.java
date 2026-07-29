package org.example.leetcode.arrays;

import java.util.Arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/24/2026
 */
public class Array11 {
    /*
        QUESTION - ROTATE IMAGE
        ========================
        You're given an n * n 2D matrix representing an image. Rotate the image by 90 degrees
        (clockwise).

        You have to rotate the image in-place. Which means you have to modify the input 2D matrix
        directly. Do not allocate another 2D matrix and do the rotation.
    */
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix[0].length - j - 1] = temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
