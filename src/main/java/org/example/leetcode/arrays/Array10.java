package org.example.leetcode.arrays;

import java.util.HashSet;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 7/24/2026
 */
public class Array10 {
    /*
        QUESTION - VALID SUDOKU
        ========================
        Determine if a 9 * 9 Sudoku board is valid. Only the filled cells needs to be validated according
        to the following rules:
            1. Each role must contain the digits 1 - 9 without repetition.
            2. Each column must contain the digits 1 - 9 without repetition.
            3. Each of the nine 3 * 3 sub-boxes of the grid must contain the digits 1 - 9 without repetition.
        Note:
            * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
            * Only the filled cells need to be validated according to the mentioned rules.
    */
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> numbersFound = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (!numbersFound.add(i + "row" + board[i][j])) {
                        return false;
                    }
                    if (!numbersFound.add(i + "columns" + board[i][j])) {
                        return false;
                    }
                    int boxNumber = ((i / 3) * 3) + (j / 3);
                    if (!numbersFound.add(boxNumber + "box" + board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
