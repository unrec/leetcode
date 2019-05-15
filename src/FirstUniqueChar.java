/*
https://leetcode.com/problems/first-unique-character-in-a-string/
#387
*/

import java.util.HashMap;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        char ch;
        HashMap<Character, Integer> map = new HashMap<>();

        // counting each char
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // finding 1st unique character
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    } // end of method
} // end of class

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