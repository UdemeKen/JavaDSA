package org.example.array.onedimensinalarray;

import java.util.Arrays;

public class ArrayCreation {
    public static void createArray() {
        int[] newArr;
        newArr = new int[5];
        newArr[0] = 1;
        newArr[1] = 2;
        newArr[2] = 3;
        newArr[3] = 4;
        newArr[4] = 5;
        System.out.println(Arrays.toString(newArr));
    }
}
