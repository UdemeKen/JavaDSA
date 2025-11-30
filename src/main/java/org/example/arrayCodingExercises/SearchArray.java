package org.example.arrayCodingExercises;

public class SearchArray {
    public static int searchInArray(int[] intArray, int valueToSearch) {
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                index = i;
            }
        }
        return index;
    }
}
