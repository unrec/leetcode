/*
https://leetcode.com/problems/number-of-1-bits
#191
*/

public class OneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    } // end of main
} // end of class