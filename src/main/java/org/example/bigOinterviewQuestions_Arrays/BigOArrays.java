package org.example.bigOinterviewQuestions_Arrays;

import java.util.Arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 6/2/2026
 */
public class BigOArrays {

//    Interview Question 1
//    Create a function which calculates the sum and product of elements of array
//    Find the time complexity for created method

   public void spotArrays(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }

//    Interview Question 2
//    Create a function which prints to the console the pairs from given array.
//    Find the time complexity for created method

    public void printPairs(int[] array) {
       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array.length; j++) {
               System.out.println(array[i] + ", " + array[j]);
           }
       }
    }

//    Interview Question 6
//    Create a method which takes an array as a parameter and reverse it.
//    Find the runtime of the created method

    public void reverse(int[] array) {
       for (int i = 0; i < array.length/2; i++) {
           int other  = array.length - i - 1;
           int temp = array[i];
           array[i] = array[other];
           array[other] = temp;
       }
        System.out.println(Arrays.toString(array));
    }
}
