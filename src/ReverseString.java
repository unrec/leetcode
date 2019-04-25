/*
https://leetcode.com/problems/reverse-string/
#344
*/

public class ReverseString {
    public void reverseString(char[] s) {
        if (s != null && s.length > 0) {

            int i = 0;
            int start = 0;
            int end = s.length - 1;
            char ch;

            while (i < s.length / 2) {
                ch = s[start];
                s[start++] = s[end];
                s[end--] = ch;
                i++;
            }
        }
    } // end of method
} // end of class
