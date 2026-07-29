package org.example.leetcode.arrays;

import java.util.HashSet;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/23/2026
 */
public class Array4 {
    /*
        QUESTION - CONTAINS DUPLICATE
        ==============================
        Given an integer of array "nums", return true if any value appears at least twice and return
        false if every element is distinct.
    */

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }
}
