package org.example.linkedListCodingExercise;

import org.example.Node;
import org.example.singlyLinkedList.SinglyLinkedList;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/3/2026
 */
public class LinkedListCodingExercise {
    public Node head;
    public Node tail;
    public int size;

    public LinkedListCodingExercise() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Push method
    public void push(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Pop method
    public void pop() {
        if (size == 0) {
            System.out.println("No singly linked list");
            return;
        }
        if (size == 1) {
            Node result = head;
            head = null;
            tail = null;
            size--;
            System.out.println("The pop node is: " + result.value);
            return;
        }
        Node tempNode = head;
        while (tempNode.next != tail) {
            tempNode = tempNode.next;
        }
        Node result = tail;
        tempNode.next = null;
        tail = tempNode;
        size--;
        System.out.println("The pop node is: " + result.value);
    }

    // Insertion  method
    public boolean insert(int data, int index) {
        if (index < 0 || index > size) {
            return false;
        }
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (size == 0) {
                tail = newNode;
            }
        } else if (index == size) {
            tail.next = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
        return true;
    }

    // Get method
    public Node get(int index) {
        if (index == 0 || index > size) {
            return null;
        }
        Node current = head;
        int counter = 0;
        while (counter < index) {
            current = current.next;
            counter++;
        }
        return current;
    }

    // Rotate method
    public String rotate(int number) {
        if (head == null || head.next == null || number <= 0) {
            return "No rotation performed!";
        }
        number = number % size;
        if (number == 0) {
            return "No rotation performed!";
        }
        Node current = head;
        int count = 1;
        while(count < number && current != null) {
            current = current.next;
            count++;
        }
        Node newHead = current.next;
        Node newTail = current;

        newTail.next = null;
        tail.next = head;
        head = newHead;
        tail = newTail;

        return "Rotation successful!";
    }

    // Set method
    public boolean set(int index, int nodeValue) {
        if (index < 0 || index >= size) {
            return false;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = nodeValue;
        return true;
    }

    // Remove method
    public Node remove(int index) {
        if (index < 0 || index >= size || head == null) {
            return null;
        }
        Node removeNode;
        if (index == 0) {
            removeNode = head;
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            return removeNode;
        }
        Node current = head;
        for (int i = 0; i < index -1; i++) {
            current = current.next;
        }
        removeNode = current.next;
        current.next = removeNode.next;
        if (removeNode == tail) {
            tail = current;
        }
        size--;
        return removeNode;
    }
}
