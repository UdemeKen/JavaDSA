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
public class Array7 {
    /*
        QUESTION - PLUS ONE
        ====================
        You are given a large integer represented as an integer array digits, where each digits[i]
        where each digit is the "ith" digit of the integer. The digits are ordered from most significant
        in left-to-right order. The large integer does not contain any leading 0's.
    */
    public int[] plusOne(int[] digits) {
        int currentDigit = digits.length - 1;
        while (digits[currentDigit] == 9) {
            if (currentDigit == 0) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                return newArray;
            }
            digits[currentDigit] = 0;
            currentDigit--;
        }
        digits[currentDigit]++;
        return digits;
    }
}
