package org.example.array.twodimensionalarray;

import java.util.Arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 11/18/2025
 */
public class InsertArray {
    int arr[][] = null;

    public InsertArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueToArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array.");
        }
    }

    public void accessCell(int row, int col) {
        System.out.println("\nAccessing row: " + row + ", Col: " + col );
        try {
            System.out.println("\nCell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }
}
