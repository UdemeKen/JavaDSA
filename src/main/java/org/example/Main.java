package org.example;

import org.example.array.twodimensionalarray.CreateArray;
import org.example.array.twodimensionalarray.InsertArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertArray insertArray = new InsertArray(2, 2);
        insertArray.insertValueToArray(0, 1, 4);
        insertArray.accessCell(0, 1);
    }
}
