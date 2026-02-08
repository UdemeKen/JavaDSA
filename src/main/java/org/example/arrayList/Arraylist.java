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

    public static void createArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30, 20, 10));
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2, 4);
        System.out.println(numbers);
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        for (int i = 0; i < stringList.size(); i++) {
            String letter = stringList.get(i);
            System.out.println(letter);
        }
    }
}
