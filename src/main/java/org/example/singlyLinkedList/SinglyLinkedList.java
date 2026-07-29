package org.example.singlyLinkedList;

import org.example.Node;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 6/3/2026
 */
public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

//    Create Singly Linked List
    public void createSinglyLinkedList(int nodeValue) {
        head = new Node(nodeValue);
        Node node = new Node(nodeValue);
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

//    Insert Singly Linked List
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node(nodeValue);
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

//    Traverse Singly Linked List
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("Singly linked list does not exist!");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tempNode.value);
                if (i != size - 1) {
                    System.out.println("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

//    Search for a node
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

//    Deleting a node from Singly Linked List
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("The Singly Linked List does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

//    Delete Entire SinglyLinkedList
    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");
    }
}
