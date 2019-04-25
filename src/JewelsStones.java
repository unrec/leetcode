/*
https://leetcode.com/problems/jewels-and-stones
#771
*/

import java.util.HashSet;
import java.util.Set;

public class JewelsStones {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;

        // 1ms
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (J.contains(Character.toString(c)))
                counter++;
        }
        // 2ms
//        Set<Character> jewels = new HashSet<>();
//
//        for (char jewel : J.toCharArray()) {
//            jewels.add(jewel);
//        }
//
//        for (char stone : S.toCharArray()) {
//            if (jewels.contains(stone))
//                counter++;
//        }

        return counter;
    } // end of method
} // end of class