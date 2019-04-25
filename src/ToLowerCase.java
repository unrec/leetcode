/*
https://leetcode.com/problems/to-lower-case
#709
*/

import java.lang.StringBuilder;

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        char low;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                low = (char) (ch + 32);
                sb.append(low);
            } else sb.append(ch);
        }
        return sb.toString();
    }// end of method
} // end of class