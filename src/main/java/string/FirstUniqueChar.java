/*
https://leetcode.com/problems/first-unique-character-in-a-string
#387
*/

package string;

import java.util.HashMap;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}

/* Brute-force approach */
// class Solution {
//     public int firstUniqChar(String s) {
//         int position = -1;
//         char ch;
//         String temp;

//         for (int i = 0; i < s.length(); i++) {
//             ch = s.charAt(i);
//             temp = s.replaceAll(Character.toString(ch),"");
//             if ((s.length() - temp.length()) == 1) {
//                 position = i;
//                 break;
//             }
//         }
//     return position;
//     }
// }