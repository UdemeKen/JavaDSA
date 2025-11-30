package org.example.arrayCodingExercises;

public class MiddleFunction {
    public static int[] middle(int[] array) {
        /* My own solution
        int size = array.length - 2;
        int[] newArr = new int[size];
        for (int i = 1; i < array.length - 1; i++) {
            newArr[i - 1] = array[i];
        } */

        /* LeetCode Solution */
        if (array.length <= 2) {
            return new int[0];
        }
        int[] middleArray = new int[array.length - 2];
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }
        return middleArray;
    }
}
