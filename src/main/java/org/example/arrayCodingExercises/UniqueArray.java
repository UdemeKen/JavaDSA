package org.example.arrayCodingExercises;

import java.util.HashSet;

public class UniqueArray {
    public static boolean isUnique(int[] intArray) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : intArray) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }
}
