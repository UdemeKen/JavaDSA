package org.example;

import org.example.array.twodimensionalarray.CreateArray;
import org.example.array.twodimensionalarray.InsertArray;
import org.example.arrayCodingExercises.*;
import org.example.arrayList.Arraylist;
import org.example.bigOinterviewQuestions_Arrays.BigOArrays;
import org.example.calculateAverageTemperature.Calculate;
import org.example.singlyLinkedList.SinglyLinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 0);
        System.out.println(sLL.head.value);
    }
}
