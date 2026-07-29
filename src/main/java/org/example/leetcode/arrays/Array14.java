package org.example.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/28/2026
 */
public class Array14 {
    /*
        QUESTION - GROUP ANAGRAMS
        ===========================
        Given an array of strings "str", group the anagrams together. You can return the answer in
        any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase
        typically using all the original letters exactly once.
    */
    public List<List<String>> groupedAnagrams(String[] str) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : str) {
            char[] charArraysForS = s.toCharArray();
            Arrays.sort(charArraysForS);
            String sortedWord = new String(charArraysForS);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
