package org.example.leetcode.arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/24/2026
 */
public class Array5 {
    /*
        QUESTION - SINGLE NUMBER
        =========================
        Given a non-empty array of integers "num", every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.
    */
    public int singleNumber(int[] nums) {
        int finder = 0;
        for (int i = 0; i < nums.length; i++) {
            finder ^= nums[i];
        }
        return finder;
    }
}
