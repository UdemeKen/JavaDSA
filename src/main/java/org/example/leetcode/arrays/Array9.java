package org.example.leetcode.arrays;

import java.util.Hashtable;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/24/2026
 */
public class Array9 {
    /*
        QUESTION - TWO SUM
        ===================
        Given an array integers "nums" and an integer "target", return indices of the two numbers such
        that they add up to target. You may assume that each input would have exactly one solution, and
        you may not use the same element twice.

        You can return the answer in any order.
    */
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> numbersFound = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbersFound.containsKey(target - nums[i])) {
                return new int[]{numbersFound.get(target - nums[i]), i};
            }
            numbersFound.put(nums[i], i);
        }
        return null;
    }
}
