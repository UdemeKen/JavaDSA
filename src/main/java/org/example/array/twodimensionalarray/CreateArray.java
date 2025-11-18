package org.example.array.twodimensionalarray;

import java.util.Arrays;

public class CreateArray {
    public void createTwoDimensionalArray() {
        int[][] twoDArray;
        twoDArray = new int[2][2];
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[1][0] = 3;
        twoDArray[1][1] = 4;
        System.out.println(Arrays.deepToString(twoDArray));

        String twoDStringArray[][] = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(twoDStringArray));
    }
}
