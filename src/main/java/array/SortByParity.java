/*
https://leetcode.com/problems/sort-array-by-parity
#905
*/

package array;

public class SortByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int i = 0;
        int start = 0;
        int end = A.length - 1;

        while (i < A.length) {
            int n = A[i];

            if (n % 2 == 0) B[start++] = n;
            else B[end--] = n;

            i++;
        }
        return B;
    }
}
