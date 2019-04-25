/*
https://leetcode.com/problems/hamming-distance
#461
*/

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int output = Integer.bitCount(x^y);
        return output;
    }
}