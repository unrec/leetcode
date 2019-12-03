/*
https://leetcode.com/problems/flipping-an-image/
#832
*/

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//        int[][] A = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}, {11, 12, 13, 14}};
        FlipImage sol = new FlipImage();
        System.out.println(Arrays.deepToString(sol.flipAndInvertImage(A)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int k = n - 1;
            for (int j = 0; j < n / 2; j++) {
                int temp;
                temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
                k--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) A[i][j] = 1;
                else A[i][j] = 0;
            }
        }
        return A;
    } // end of method
} // end of class