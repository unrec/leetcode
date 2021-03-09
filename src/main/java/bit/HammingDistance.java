/*
https://leetcode.com/problems/hamming-distance
#461
*/

package bit;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int output = Integer.bitCount(x ^ y);
        return output;
    }
}