package org.example.circularSinglyLinkedListCodingExercise;

import org.example.Node;
import org.example.circularSinglyLinkedList.CircularSinglyLinkedList;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 9/23/2026
 */
public class CircularLinkedListCodingExercise {
    public Node head;
    public Node tail;
    public int size;

    public CircularLinkedListCodingExercise() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Append Method
    public void append(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            System.out.println(node.value);
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
            System.out.println(node.next.value);
        }
        size++;
    }

    public void prepend(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            System.out.println(node.next.value);
        } else {
            node.next = head;
            head = node;
            tail.next = head;
            System.out.println(node.next.value);
        }
        size++;
    }

    // Delete Method
    public boolean deleteByValue(int nodeValue) {
        if (head == null) {
            return false;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return true;
        }

        Node currentNode = head;
        Node previousNode = null;
        for (int i = 0; i < size; i++) {
            if (currentNode.value == nodeValue) {
                if (currentNode == head) {
                    head = currentNode.next;
                    currentNode = head;
                    tail.next = head;
                } else if (currentNode == tail) {
                    tail = previousNode;
                    tail.next = head;
                } else {
                    previousNode.next = currentNode.next;
                }
                size--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    // CountNode Method
    public int CountNode() {
        int count = 0;
        Node tempNode = head;
        if (tempNode == null) {
            return 0;
        }

        do {
            count++;
            tempNode = tempNode.next;
        } while (tempNode != head);

        return count;
    }
}
