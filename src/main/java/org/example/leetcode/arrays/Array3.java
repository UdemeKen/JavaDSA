package org.example.leetcode.arrays;

import java.util.Arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/23/2026
 */
public class Array3 {
    /*
        QUESTION - ROTATE ARRAY
        ========================
        Given an array, rotate the array to the right by "k" steps, where "k" is non-negative.
    */

    public void rotateArray(int[] nums, int k) {

        k = k % nums.length;

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Reverse first "k" element
        reverse(nums, 0, k - 1);

        // Reverse the last nums.length - k elements
        reverse(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
