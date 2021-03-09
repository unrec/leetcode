/*
https://leetcode.com/problems/unique-morse-code-words
#804
*/

package string;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class UniqueMorseCode {
    public static void main(String[] args) {
        String[] test = {"gin", "zen", "gig", "msg"};
        UniqueMorseCode sol = new UniqueMorseCode();

        System.out.println(sol.uniqueMorseRepresentations(test));
    }

    public int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-", "-...", "-.-.", "-..", "", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Character, String> dict = new LinkedHashMap<>();
        Set<String> transformed = new TreeSet<>();
        char ch = 'a';

        for (String s : codes) {
            dict.put(ch, s);
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
    }
}
