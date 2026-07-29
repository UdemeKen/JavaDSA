package org.example.leetcode.arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/23/2026
 */
public class Array1 {

    /*
        QUESTION - REMOVE DUPLICATES
        =============================
        Given an integer array "nums" sorted in non-decreasing order, remove the duplicate in place
        such that each unique element appear once. The relative order of the element should be kept
        the same.

        Since it is impossible to change the length of the array in some languages, you must instead
        have the result be place in the first part of the array "nums". More formally, if there are "k"
        elements after removing the duplicate, then the first "k" elements of "nums" should the final
        result. It does not matter what you leave beyond the first "k" elements.

        Return "k" after placing the final result in the first "k" slots of nums.

        Do not allocate extra space for another array. You must do this by modifying the input array in-place
        with O(1) extra memory.
    */
    public int removeDuplicates(int[] nums) {
        int lastUniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[lastUniqueIndex] != nums[i]) {
                nums[lastUniqueIndex + 1] = nums[i];
                lastUniqueIndex++;
            }
        }
        return lastUniqueIndex + 1;
    }
}
