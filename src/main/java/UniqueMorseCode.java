/*
https://leetcode.com/problems/unique-morse-code-words
#804
*/

import java.lang.*;
import java.util.*;

public class UniqueMorseCode {
    public static void main(String[] args) {
        String[] test = {"gin", "zen", "gig", "msg"};
        UniqueMorseCode sol = new UniqueMorseCode();

        System.out.println(sol.uniqueMorseRepresentations(test));
    } // end of main

    public int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Character, String> dict = new LinkedHashMap<>();
        Set<String> transformed = new TreeSet<>();
        char ch = 'a';

        // putting codes and letters to HashMap
        for (int i = 0; i < codes.length; i++) {
            dict.put(ch, codes[i]);
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                String code = dict.get(c);
                sb.append(code);
            }
            transformed.add(sb.toString());
            sb.delete(0, sb.length());
        }

        return transformed.size();
    }// end of method
} // end of class
