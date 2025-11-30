package org.example.arrayCodingExercises;

public class MaxProduct {
    public static String maxProducts(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + ", " + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}
