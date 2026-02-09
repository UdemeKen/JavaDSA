package org.example.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 2/7/2026
 */
public class Arraylist {

//    Creation of an ArrayList
    public static void createArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30, 20, 10));
        System.out.println(numbers);
    }

//    Insertion to an Arraylist
    public static ArrayList<String> insertArrayList() {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        return stringList;
    }

//    ArrayList Traversal
    public static void traverseArrayList() {
        ArrayList<String> stringList = insertArrayList();
        for (int i = 0; i < stringList.size(); i++) {
            String letter = stringList.get(i);
            System.out.println(letter);
        }
    }

//    Search for an element in ArrayList
    public static void searchArrayList(String letter) {
        ArrayList<String> stringList = insertArrayList();
        for (String letters : stringList) {
            if (letters.equals(letter)) {
                System.out.println("The element is found! Here: " + letters);
                break;
            }
        }
//        IndexOf
        int index = stringList.indexOf(letter);
        System.out.println("The element is found at index of: " + index);
    }

//    Remove element from arraylist
    public static void removeElement() {
        ArrayList<String> stringArrayList = insertArrayList();
        stringArrayList.remove("B");
        System.out.println(stringArrayList);
    }
}
