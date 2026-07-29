package org.example.leetcode.arrays;

import java.util.ArrayList;
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
public class Array6 {
    /*
        QUESTION - INTERSECTION OF TWO ARRAYS II
        ==========================================
        Given two integer arrays "nums1" and "nums2", return an array of their intersection. Each element
        in the result must appear as many times as it shows in both arrays, and you may return the result
        in any order.
    */
    public int[] intersect(int[] nums1, int[] nums2) {
        Hashtable<Integer, Integer> nums1Map = new Hashtable<>();
        ArrayList<Integer> intersectionAL = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (nums1Map.containsKey(nums1[i])) {
                nums1Map.put(nums1[i], nums1Map.get(nums1[i]) + 1);
            } else {
                nums1Map.put(nums1[i], i);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums1Map.containsKey(nums2[i])) {
                intersectionAL.add(nums2[i]);
                nums1Map.put(nums2[i], nums1Map.get(nums2[i]) - 1);
                if (nums1Map.get(nums2[i]) == 0) {
                    nums1Map.remove(nums2[i]);
                }
            }
        }

        int[] result = new int[intersectionAL.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersectionAL.get(i);
        }

        return result;
    }
}
