package org.example.arrayCodingExercises;

import java.util.Arrays;

public class BestScore {
    public static int[] findTopTwoScores(int[] array) {
        /* My own solution
        Arrays.sort(array);
        int[] newArray = new int[2];
        newArray[0] = array[array.length - 1];
        newArray[1] = array[array.length - 2]; */

        /* LeetCode Solution */
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }
        return new int[] {firstHighest, secondHighest};
    }
}
