package org.example.linkedListInterviewuestions;

import org.example.DoublyNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 10/9/2026
 */
public class LinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    // Create LinkedList
    public void createLL(int nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    // Insertion Method
    public void insertNode(int nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Traversal Method
    public void traverseLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.println(tempNode.value);
            if (i != size - 1) {
                System.out.println("-->");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    public void deleteDups(LinkedList ll) {
        Set<Integer> seen = new HashSet<>();
        DoublyNode current = ll.head;
        DoublyNode previous = null;

        while (current != null) {
            if (seen.contains(current.value)) {
                previous.next = current.next;
                ll.size--;
            } else {
                seen.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    public DoublyNode nthToLast(LinkedList ll, int n) {
        DoublyNode p1 = ll.head;
        DoublyNode p2 = ll.head;
        for (int i = 0; i < n; i++) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public LinkedList partition(LinkedList ll, int x) {
        DoublyNode currentNode = ll.head;
        while (currentNode != null) {
            DoublyNode next = currentNode.next;
            if (currentNode.value < x ) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    public LinkedList sumLists(LinkedList llA, LinkedList llB) {
        DoublyNode n1 = llA.head;
        DoublyNode n2 = llB.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while (n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insertNode(result % 10);
            carry = result / 10;
        }
        return resultLL;
    }

    // Question 5 - Intersection
    // getKthNode
    public DoublyNode getKthNode(DoublyNode head, int k) {
        DoublyNode current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    // Intersection Method
    public DoublyNode findIntersection(LinkedList list1, LinkedList list2) {
        if (list1.head == null || list2.head == null) return null;
        if (list1.tail != list2.tail) {
            return null;
        }
        DoublyNode shorter = new DoublyNode();
        DoublyNode longer = new DoublyNode();
        if (list1.size > list2.size) {
            longer = list1.head;
            shorter = list2.head;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }
        longer = getKthNode(longer, Math.abs(list1.size - list2.size));
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    // Add same node
    public void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
    }
}
