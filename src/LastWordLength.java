/*
https://leetcode.com/problems/length-of-last-word/
#58
*/

public class LastWordLength {

    public int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;

        int length, lastSpace;
        s = s.trim();

        lastSpace = s.lastIndexOf(" ");
        length = s.length() - lastSpace - 1;

        /* iterative approach without trimming */
//        int lastSign = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != ' ') lastSign = i;
//        }
//        lastSpace = s.lastIndexOf(" ", lastSign);
//        length = lastSign - lastSpace;

        return length;
    } // end of method
} // end of class


