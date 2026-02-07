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
        System.out.println(numbers);
    }
}
