package org.example.arrayCodingExercises;

public class MissingNumber {
    public static int findMissingNumberInArray(int[] arr) {
        /* My own solution */
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
