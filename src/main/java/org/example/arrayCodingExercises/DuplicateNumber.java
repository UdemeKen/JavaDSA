package org.example.arrayCodingExercises;

import java.util.Arrays;

public class DuplicateNumber {
    public static int[] removeDuplicates(int[] arr) {
        /* My own solution
        if (arr.length == 0) {
            return arr;
        }

        Arrays.sort(arr);
        int size = arr.length;
        int[] newArray = new int[size];
        int newIndex = 0;

        newArray[newIndex++] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                newArray[newIndex++] = arr[i];
            }
        } */

        /* LeetCode Solution */
        int n = arr.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = arr[i];
            }
        }
        return  Arrays.copyOf(uniqueArray, index);
    }
}
