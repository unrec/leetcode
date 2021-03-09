/*
https://leetcode.com/problems/non-decreasing-array
#665
*/

package array;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] a) {
        int modified = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                if (modified++ > 0) return false;
                if (i - 2 < 0 || a[i - 2] <= a[i]) a[i - 1] = a[i];
                else a[i] = a[i - 1];
            }
        }
        return true;
    }
}