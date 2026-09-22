package org.example;

import org.example.circularSinglyLinkedList.CircularSinglyLinkedList;
import org.example.linkedListCodingExercise.LinkedListCodingExercise;
import org.example.singlyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
    }
}
