/*
https://leetcode.com/problems/flipping-an-image
#832
*/

package string;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = i;
                for (int k = 0; k < needle.length(); k++) {
                    if (haystack.charAt(j) == needle.charAt(k)) {
                        if (k == needle.length() - 1) {
                            return i;
                        } else {
                            j++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return -1;
    }
}