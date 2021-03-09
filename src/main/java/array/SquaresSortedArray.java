/*
https://leetcode.com/problems/squares-of-a-sorted-array
#50
*/

package array;

import java.util.Arrays;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] A) {
        int[] output = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            output[i] = A[i] * A[i];
        }
        Arrays.sort(output);
        return output;
    }
}
