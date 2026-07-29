package org.example.leetcode.arrays;

import java.util.Arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/24/2026
 */
public class Array8 {
    /*
        QUESTION - MOVE ZEROES
        =======================
        Given an integer array "nums", move all 0's to the end of it while maintaining the relative
        order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.
    */
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int L = 0;
        int R = 1;
        while (R < nums.length) {
            if (nums[L] != 0) {
                L++;
                R++;
            } else if (nums[R] == 0) {
                R++;
            } else {
                int temp = nums[R];
                nums[R] = nums[L];
                nums[L] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
